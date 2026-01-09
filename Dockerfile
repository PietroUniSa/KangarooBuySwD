# ===== STAGE 1: build WAR =====
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -q -DskipTests package

# ===== STAGE 2: run on Tomcat =====
FROM tomcat:10.1-jdk17-temurin

# rimuove app di default
RUN rm -rf /usr/local/tomcat/webapps/*

# deploy WAR come ROOT
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

# JNDI datasource config
COPY docker/tomcat/context.xml /usr/local/tomcat/conf/context.xml

# driver MySQL per Tomcat
ADD https://repo1.maven.org/maven2/com/mysql/mysql-connector-j/8.4.0/mysql-connector-j-8.4.0.jar /usr/local/tomcat/lib/

EXPOSE 8080
CMD ["catalina.sh", "run"]
