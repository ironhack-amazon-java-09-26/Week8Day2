# Exercise Week 8 – Day 1

Replicar lo mismo que hicimos aquí, pero con **viajes**.

## Entidades

| Entidad    | Campos                |
|------------|-----------------------|
| `Trip`     | `destination`         |
| `Itinerary`| `description`         |
| `Flight`   | `origin`, `destination` |
| `Traveler` | `name`, `email`       |

## Relaciones

| Relación              | Tipo         |
|-----------------------|--------------|
| `Trip` → `Itinerary`  | One to One   |
| `Trip` → `Flight`     | One to Many  |
| `Trip` ↔ `Traveler`   | Many to Many |
