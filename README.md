# NetworkManagement

NetworkManagement est une application RESTful pour la gestion des configurations réseau. Le projet a été initialement récupéré sur [restfulapi.net](https://restfulapi.net/create-rest-apis-with-jax-rs/) et a été mis à jour pour utiliser les dernières dépendances Jakarta EE.

## Mise à jour de JavaX à Jakarta

Le projet a été mis à jour pour utiliser Jakarta EE, avec tous les packages renommés de `javax.*` à `jakarta.*`.

## Prérequis

- Java 8 ou une version ultérieure
- Maven
- Tomcat

Vous pouvez vérifier si vous avez les prérequis en exécutant :

```bash
java -version
mvn -version
```

## Installation

Pour installer le projet, exécutez la commande suivante :

```bash
mvn clean install
```

## Déploiement

1. Naviguez jusqu'au répertoire racine de votre projet.
2. Construisez le projet avec `mvn clean install`.
3. Déployez le fichier `.war` généré dans le répertoire `target` sur votre serveur Tomcat.
4. Démarrez votre serveur Tomcat.

## API

L'application fournit plusieurs endpoints REST :
#### URL : [`http://localhost:8080/NetworkManagement/network-management/configurations`](http://localhost:8080/NetworkManagement/network-management/configurations)

- `GET http://localhost:8080/NetworkManagement/network-management/configurations` : Récupère toutes les configurations.
- `GET http://localhost:8080/NetworkManagement/network-management/configurations/{id}` : Récupère une configuration spécifique par son ID.
- `POST http://localhost:8080/NetworkManagement/network-management/configurations` : Crée une nouvelle configuration.
- `PUT http://localhost:8080/NetworkManagement/network-management/configurations/{id}` : Met à jour une configuration existante.
- `DELETE http://localhost:8080/NetworkManagement/network-management/configurations/{id}` : Supprime une configuration existante.
