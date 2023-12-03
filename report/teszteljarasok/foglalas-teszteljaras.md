# Tesztjegyzőkönyv-`Foglalás`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Foglalás` funkcióihoz készült.   
Felelőse: `Hajas Attila István`

## 1. Teszteljárások (TP)

### 1.1. Foglalás tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02, TC-03, TC-04
- Leírás: foglalási folyamat tesztelése
  1. lépés: Regisztráljunk az alkalmazásba, jelentkezzünk be, majd lépjünk a foglalás oldalra
  2. Keressünk rá a szállásra megfelelő adatok alapján, majd válasszuk ki a szállást
  3. lépés: Nyomjuk meg a `Foglalás` gombot
  4. lépés: Töltjük ki a személyes adatokat a foglaláshoz(Érkezés, Távozás, Fő)
  5. lépés: Nyomjuk meg az új oldalon lévő formnál a  `Foglalás` gombot
  6. lépés: Ellenőrizzük az eredményt.   
Elvárt eredmény: `Sikeres foglalás, a foglalás alatti fülön megjelenik a legfoglalt szállás`

## 2. Teszesetek (TC)
#### 2.1. TC-01
- TP: TP-01
- Leírás: Helyes személyes adatok megadása
- Bemenet: Szállás kiválasztva ;  
`Érkezés` = 2023.12.03;  
`Távozás` = 2023.12.04;   
`Fő` = 1
- Művelet: nyomjuk meg a `Foglalás` gombot
- Elvárt kimenet: Átirányít a 'Foglalások' oldalra, ahol látom a lefoglalt szállást.

#### 2.2. TC-02
- TP: TP-01
- Leírás: Időpont kiválasztása nélkül próbálunk foglalni
- Bemenet: Szállás kiválasztva ;  
  `Érkezés` = ....-..-..;  
  `Távozás` = ....-..-..;   
  `Fő` = 1
- Művelet: nyomjuk meg a `Foglalás` gombot
- Elvárt kimenet:  
Egy hibaüzenet, ami : `Töltse ki az összes mezőt!`

#### 2.3. TC-03
- TP: TP-01
- Leírás: Fő megadása nélkül próbálunk foglalni
- Bemenet: Szállás kiválasztva ;  
  `Érkezés` = 2023.12.03;  
  `Távozás` = 2023.12.04; 
  `Fő` = 0
- Művelet: nyomjuk meg a `Foglalás` gombot
- Elvárt kimenet:  
  Egy hibaüzenet, ami : `Válasszon egy pozitív számot!`

#### 2.3. TC-04
- TP: TP-01
- Leírás:  Semmilyen mező megadása nélkül próbálunk foglalni
- Bemenet: Szállás kiválasztva ;  
  `Érkezés` = ....-..-..;  
  `Távozás` = ....-..-..;
  `Fő` = 0
- Művelet: nyomjuk meg a `Foglalás` gombot
- Elvárt kimenet:  
  Egy hibaüzenet, ami : `Töltse ki a mezőket!`
