# Tesztjegyzőkönyv-`Alapműveletek`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Bejelentkezés` funkcióihoz készült. Felelőse: `Kele Dominik Norbert`

## 1. Teszteljárások (TP)

### 1.1. Bejelentkezés tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02, TC-03
- Leírás: összeadás funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a bejelentkezés oldalra
    1. lépés: A `Felhasználónév` szövegbeviteli mezőbe írjunk be egy felhasználónevet
    2. lépés: A `Jelszó` szövegbeviteli mezőbe írjunk be egy jelszót
    3. lépés: Nyomjuk meg az `Bejelentkezés` gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `Átnavigál a felhasználó profil oldalra.`

## 2. Teszesetek (TC)

#### 2.1. TC-01
- TP: TP-01
- Leírás: Felhasználónév hibás beírása
- Bemenet: `Felhasználónév` = HibásNév ; `Jelszó` = 12345678
- Művelet: nyomjuk meg az `Bejelentkezés` gombot
- Elvárt kimenet: Egy hibaüzenet, ami : `Hibás felhasználónév vagy jelszó.`

#### 2.2. TC-02
- TP: TP-01
- Leírás: Jelszó hibás beírása
- Bemenet: `Felhasználónév` = KeleD ; `Jelszó` = hibásjelszó
- Művelet: nyomjuk meg az `Bejelentkezés` gombot
- Elvárt kimenet: Egy hibaüzenet, ami : `Hibás felhasználónév vagy jelszó.`

#### 2.3. TC-03
- TP: TP-01
- Leírás: Helyes felhasználónév és jelszó megadás
- Bemenet: `Vezetéknév módosítás` =  KeleD ; `Jelszó` = 12345678
- Művelet: nyomjuk meg az `Bejelentkezés` gombot
- Elvárt kimenet: Átnavigáljon a felhasználó profil oldalára.
