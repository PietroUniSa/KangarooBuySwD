FROM tomcat:10.1-jdk21

# Rimuovo le app di default (opzionale ma consigliato)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copio il WAR buildato da Maven
COPY target/Kangaroo.war /usr/local/tomcat/webapps/ROOT.war

# Copio il MySQL Connector (se NON è già nel WAR)
COPY docker/tomcat/libs/mysql-connector-j-8.0.12.jar /usr/local/tomcat/lib/

# Copio il context.xml con il DataSource
COPY docker/tomcat/context.xml /usr/local/tomcat/conf/context.xml

# ⚠️ FONDAMENTALE: avvia Tomcat
CMD ["catalina.sh", "run"]
