#Mini Mario State Machine  
*A Java console game demonstrating the State Pattern, OOP design, and basic game mechanics.*

This project implements a simplified Mario game using the **State Pattern**, one of the most important behavioral design patterns in software engineering.  
Mario transitions between different states — **Small**, **Super**, **Invincible**, and **Dead** — and each state changes how he reacts to events such as mushrooms, stars, enemies, and pits.

This project was created as part of my B.Sc. in Computer Science to build clean OOP architecture and practice design-pattern implementation.

---
##Features

- Fully implemented **State Pattern** with dynamic behavior changes  
- Command-based console game loop  
- Mario can be:
  - **Small**
  - **Super**
  - **Invincible**
  - **Dead**
- Player actions:
  - `mushroom` – power up  
  - `star` – become invincible  
  - `enemy` – encounter an enemy  
  - `pit` – fall into a pit  
  - `coin` – collect a coin (+10 score)  
  - `status` – display Mario’s stats  
- Tracks:
  -  Lives  
  -  Coins  
  -  Score  
  -  Steps survived (player actions)

---

## Why the State Pattern?

The State Pattern lets an object alter its behavior when its internal state changes — without writing long `if-else` or `switch` statements.

Example:

```java
mario.onEnemy();

