# Pen

## Overview
This project implements low level design for a Pen system.
It demonstrates OOP concepts, SOLID principles and design patterns.

## functionalities/APIs:-
1. write(String text)
2. refill()  


### what's a Pen?
A Pen is something that has a Body, Nib and Ink.

### Types of Pens in the system:
1. BallPen
   - Has a Refill which in turn has Nib and Ink
2. InkPen
   - Has Nib and Ink
3. Marker
   - Has Nib and Ink
   
### Behaviours:
```write(String text)``` -> All the Pens have distinct write behaviour.

```refill()``` -> BallPen refills by changing the refill, whereas InkPen and Marker
just add the ink.


### Future scope
we might have other objects which can write like Pencil and Chalk.