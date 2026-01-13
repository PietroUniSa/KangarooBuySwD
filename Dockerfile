FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM tomcat:10.1-jdk21
RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=build /app/target/Kangaroo.war /usr/local/tomcat/webapps/ROOT.war

# Creiamo una cartella ESTERNA alla webapp per i caricamenti
RUN mkdir -p /var/kangaroo_uploads
# Diamo i permessi di scrittura
RUN chmod 777 /var/kangaroo_uploads

EXPOSE 8080
CMD ["catalina.sh", "run"]