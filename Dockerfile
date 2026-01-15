# Image officielle Maven avec Java
FROM maven:3.9.6-eclipse-temurin-17

# Dossier de travail dans le conteneur
WORKDIR /app

# Copier les fichiers Maven en premier (optimisation cache)
COPY pom.xml .

# Télécharger les dépendances
RUN mvn dependency:go-offline

# Copier le reste du projet
COPY src ./src

# Lancer les tests
CMD ["mvn", "test"]
