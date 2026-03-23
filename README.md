📦 Gestionnaire de Stock - Spring Boot & Thymeleaf
Ce projet est une application web de gestion de produits permettant de réaliser des opérations CRUD complètes avec une interface utilisateur dynamique et validée.

🚀 1. Fonctionnalités Principales

* CRUD Complet : Ajouter, modifier, supprimer et afficher des produits.
* Pagination & Recherche : Navigation fluide dans le catalogue avec filtrage par nom.
* Validation Robuste : Contrôle des données côté serveur avant persistance en base de données.
  
🏗️ 2. Architecture du Projet

L'application suit le pattern MVC (Modèle-Vue-Contrôleur) structuré comme suit :
Backend (Java / Spring Boot)
* Entité (`Product`) : Modèle de données avec annotations de validation Jakarta Bean Validation.
* Repository (`ProductRepository`) : Interface étendant `JpaRepository` pour l'accès aux données.
* Service (`ProductService`) : Couche intermédiaire gérant la logique métier.
* Contrôleur (`ProductController`) : Gestion des points d'entrée HTTP et navigation.
Frontend (Thymeleaf / HTML5)
* `index.html` : Tableau de bord principal avec barre de recherche et pagination.
* `addPage.html` : Formulaire dynamique utilisé pour la création et l'édition.
  
🛡️ 3. Validation des Données

Nous garantissons l'intégrité des données via des annotations de validation directement sur l'entité :
ChampAnnotationRègleNom`@Size`Entre 3 et 150 caractèresPrix`@Min(0)`Ne peut pas être négatifQuantité`@Min(1)`Au moins une unité requise
Note : Les messages d'erreur sont injectés dynamiquement dans les vues via `th:errors`.

🛠️ 4. Technologies Utilisées

* Langage : Java 21
* Framework Core : Spring Boot 3.x
* Persistance : Spring Data JPA / Hibernate
* Moteur de Template : Thymeleaf
* Base de Données : H2 (Base en mémoire pour le développement) / postgresql
* Build Tool : Maven

🔄 5. Flux Utilisateur (Workflow)

1. Consultation : L'utilisateur arrive sur la liste paginée.
2. Filtrage : Saisie d'un mot-clé pour affiner la recherche en temps réel.
3. Gestion :
   * Cliquer sur "Nouveau" ouvre un formulaire vide.
   * Cliquer sur "Modifier" pré-remplit le formulaire avec les données existantes.
   * Cliquer sur "Supprimer" retire l'entrée après confirmation.
<img width="1366" height="642" alt="image" src="https://github.com/user-attachments/assets/b9991544-0144-48eb-8e62-14d02098e81c" />

<img width="1366" height="689" alt="image" src="https://github.com/user-attachments/assets/98b2b062-2362-4c57-a1f1-fbadf921dd32" />

