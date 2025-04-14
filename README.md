# Cpt Rdu Class Animal

## Structure des Classes

### Classe Animal
Classe de base représentant un animal générique.
- **Attributs**: `nom` (String)
- **Méthodes**:
  - `parler()`: Affiche "Je suis un animal"
  - `toString()`: Retourne le nom et la classe de l'animal

### Classes Dérivées
- **Chien**: Hérite de Animal
  - Redéfinit `parler()` pour afficher "Woof !"
- **Chat**: Hérite de Animal
  - Redéfinit `parler()` pour afficher "Miaou !"

### Classe AnimalerieUtil
Contient des méthodes utilitaires pour manipuler des collections d'animaux.
- **Méthodes**:
  - `afficherAnimaux(List<? extends Animal> liste)`: Appelle la méthode `parler()` de chaque animal
  - `ajouterChien(List<? super Chien> liste)`: Ajoute un nouveau chien à la liste
  - `afficherTous(List<?> liste)`: Affiche tous les éléments d'une liste
  - `fermerScanner()`: Ferme le scanner utilisé pour l'entrée utilisateur

### Classe Main
Point d'entrée du programme qui teste les différentes fonctionnalités.
- Crée trois types de listes:
  - `List<Chien>`: Collection de chiens
  - `List<Animal>`: Collection d'animaux
  - `List<Object>`: Collection d'objets
- Teste les méthodes d'AnimalerieUtil sur chaque liste

## Utilisation des Génériques
Le programme utilise trois types de contraintes génériques:
- `<? extends Animal>`: Accept uniquement les sous-types d'Animal
- `<? super Chien>`: Accept uniquement les super-types de Chien
- `<?>`: Accept n'importe quel type

## Exécution du Programme
Lors de l'exécution, le programme:
1. Crée et remplit les listes avec des objets appropriés
2. Teste les méthodes utilitaires sur chaque liste
3. Affiche les résultats avec des séparateurs pour une meilleure lisibilité
4. Permet à l'utilisateur d'ajouter de nouveaux chiens dans les collections compatibles
