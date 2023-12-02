# Tesztjegyzőkönyv-`Alapműveletek`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Regisztráció` funkcióihoz készült. Felelőse: `Kele Dominik Norbert`

## 1. Teszteljárások (TP)

### 1.1. Regisztráció tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02, TC-03, TC-04, TC-05, TC-06, TC-07, TC-08
- Leírás: regisztráció funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a bejelentkezés oldalra
    1. lépés: A `Vezetéknév` szövegbeviteli mezőbe írjunk be egy vezetéknevet
    2. lépés: A `Keresztnév` szövegbeviteli mezőbe írjunk be egy keresztnevet
    3. lépés: A `Email` szövegbeviteli mezőbe írjunk be egy emailt
    4. lépés: A `Felhasználónév` szövegbeviteli mezőbe írjunk be egy felhasználónevet
    5. lépés: A `Jelszó` szövegbeviteli mezőbe írjunk be egy jelszót
    6. lépés: A `Jogosultság` szövegbeviteli mezőbe írjunk be egy jogosutságot
    7. lépés: Nyomjuk meg az `Regisztráció` gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `URL-be kiírja, hogy register/?succes`

## 2. Teszesetek (TC)

#### 2.1. TC-01
- TP: TP-01
- Leírás: Nem adunk meg vezetéknevet
- Bemenet: `Vezetéknév` =  ; `Keresztnév` = Dominik ; `Email` = teszt@gmail.com; `Felhasználónév` = KeleD; `Jelszó` = 123456; `Jogosultság` = GUEST
- Művelet: nyomjuk meg az `Regisztráció` gombot
- Elvárt kimenet: Egy hibaüzenet, ami : `A vezetéknév megadása kötelező.`

#### 2.2. TC-02
- TP: TP-01
- Leírás: Nem adunk meg keresztnevet
- Bemenet: `Vezetéknév` = Kele ; `Keresztnév` =  ; `Email` = teszt@gmail.com; `Felhasználónév` = KeleD; `Jelszó` = 123456; `Jogosultság` = GUEST
- Művelet: nyomjuk meg az `Regisztráció` gombot
- Elvárt kimenet: Egy hibaüzenet, ami : `A keresztnév megadása kötelező.`

#### 2.3. TC-03
- TP: TP-01
- Leírás: Nem adunk meg email címet
- Bemenet: `Vezetéknév` =  Kele; `Keresztnév` = Dominik ; `Email` = ; `Felhasználónév` = KeleD; `Jelszó` = 123456; `Jogosultság` = GUEST
- Művelet: nyomjuk meg az `Regisztráció` gombot
- Elvárt kimenet: Egy hibaüzenet, ami : `Az email cím megadása kötelező.`

#### 2.4. TC-04
- TP: TP-01
- Leírás: Nem adunk meg felhasználónevet
- Bemenet: `Vezetéknév` =  Kele; `Keresztnév` = Dominik ; `Email` = teszt@gmail.com ; `Felhasználónév` = ; `Jelszó` = 123456; `Jogosultság` = GUEST
- Művelet: nyomjuk meg az `Regisztráció` gombot
- Elvárt kimenet: Egy hibaüzenet, ami : `A felhasználónév megadása kötelező.`

#### 2.5. TC-05
- TP: TP-01
- Leírás: Nem adunk meg jelszót
- Bemenet: `Vezetéknév` =  Kele; `Keresztnév` = Dominik ; `Email` = teszt@gmail.com ; `Felhasználónév` = KeleD; `Jelszó` = ; `Jogosultság` = GUEST
- Művelet: nyomjuk meg az `Regisztráció` gombot
- Elvárt kimenet: Egy hibaüzenet, ami : `A jelszó megadása kötelező.`

#### 2.6. TC-06
- TP: TP-01
- Leírás: Kevesebb mint 6 karakterű jelszót adok meg
- Bemenet: `Vezetéknév` =  Kele; `Keresztnév` = Dominik ; `Email` = teszt@gmail.com ; `Felhasználónév` = KeleD; `Jelszó` = 123; `Jogosultság` = GUEST
- Művelet: nyomjuk meg az `Regisztráció` gombot
- Elvárt kimenet: Egy hibaüzenet, ami : `A jelszó minimum 6 karakter hosszú kell, hogy legyen.`

#### 2.7. TC-07
- TP: TP-01
- Leírás: Nem adunk meg jogosultságot
- Bemenet: `Vezetéknév` =  Kele; `Keresztnév` = Dominik ; `Email` = teszt@gmail.com ; `Felhasználónév` = KeleD; `Jelszó` = 123456; `Jogosultság` = 
- Művelet: nyomjuk meg az `Regisztráció` gombot
- Elvárt kimenet: Egy hibaüzenet, ami : `A jogosultság megadása kötelező.`

#### 2.8. TC-08
- TP: TP-01
- Leírás: Nem GUEST vagy ACCOMODATION-t adok meg jogosultságnak
- Bemenet: `Vezetéknév` =  Kele; `Keresztnév` = Dominik ; `Email` = teszt@gmail.com ; `Felhasználónév` = KeleD; `Jelszó` = 123456; `Jogosultság` = valami
- Művelet: nyomjuk meg az `Regisztráció` gombot
- Elvárt kimenet: Egy hibaüzenet, ami : `A jogosultság vagy GUEST vagy ACCOMODATION lehet.`

## 3. Tesztriportok (TR)

### Regisztráció funkció tesztriportjai

#### 3.1. TR-01 (TC-01)
- TP: TP-01
  1. lépés: "" beírtam
  2. lépés: Dominik beírtam
  3. lépés: teszt@gmail.com beírtam
  4. lépés: KeleD beírtam
  5. lépés: 123456 beírtam
  6. lépés: GUEST beírtam
  7. lépés: a gomb egyszeri megnyomás után frissít az oldal
  8. lépés: helyes eredményt kaptam (A vezetéknév megadása kötelező.)

#### 3.2. TR-02 (TC-02)
- TP: TP-01
  1. lépés: Kele beírtam
  2. lépés: "" beírtam
  3. lépés: teszt@gmail.com beírtam
  4. lépés: KeleD beírtam
  5. lépés: 123456 beírtam
  6. lépés: GUEST beírtam
  7. lépés: a gomb egyszeri megnyomás után frissít az oldal
  8. lépés: helyes eredményt kaptam (A keresztnév megadása kötelező.)

#### 3.3. TR-03 (TC-03)
- TP: TP-01
  1. lépés: Kele beírtam
  2. lépés: Dominik beírtam
  3. lépés: "" beírtam
  4. lépés: KeleD beírtam
  5. lépés: 123456 beírtam
  6. lépés: GUEST beírtam
  7. lépés: a gomb egyszeri megnyomás után frissít az oldal
  8. lépés: helyes eredményt kaptam (A email cím megadása kötelező.)

#### 3.4. TR-04 (TC-04)
- TP: TP-01
  1. lépés: Kele beírtam
  2. lépés: Dominik beírtam
  3. lépés: teszt@gmail.com beírtam
  4. lépés: "" beírtam
  5. lépés: 123456 beírtam
  6. lépés: GUEST beírtam
  7. lépés: a gomb egyszeri megnyomás után frissít az oldal
  8. lépés: helyes eredményt kaptam (A felhasználónév megadása kötelező.)

#### 3.5. TR-05 (TC-05)
- TP: TP-01
  1. lépés: Kele beírtam
  2. lépés: Dominik beírtam
  3. lépés: teszt@gmail.com beírtam
  4. lépés: KeleD beírtam
  5. lépés: "" beírtam
  6. lépés: GUEST beírtam
  7. lépés: a gomb egyszeri megnyomás után frissít az oldal
  8. lépés: helyes eredményt kaptam (A jelszó megadása kötelező.)

#### 3.6. TR-06 (TC-06)
- TP: TP-01
  1. lépés: Kele beírtam
  2. lépés: Dominik beírtam
  3. lépés: teszt@gmail.com beírtam
  4. lépés: KeleD beírtam
  5. lépés: 123 beírtam
  6. lépés: GUEST beírtam
  7. lépés: a gomb egyszeri megnyomás után frissít az oldal
  8. lépés: helyes eredményt kaptam (A jelszó minimum 6 karakter hosszú kell, hogy legyen.)

#### 3.7. TR-07 (TC-07)
- TP: TP-01
  1. lépés: Kele beírtam
  2. lépés: Dominik beírtam
  3. lépés: teszt@gmail.com beírtam
  4. lépés: KeleD beírtam
  5. lépés: 123456 beírtam
  6. lépés: "" beírtam
  7. lépés: a gomb egyszeri megnyomás után frissít az oldal
  8. lépés: helyes eredményt kaptam (A jogosultság megadása kötelező.)

#### 3.8. TR-08 (TC-08)
- TP: TP-01
  1. lépés: Kele beírtam
  2. lépés: Dominik beírtam
  3. lépés: teszt@gmail.com beírtam
  4. lépés: KeleD beírtam
  5. lépés: 123456 beírtam
  6. lépés: valami beírtam
  7. lépés: a gomb egyszeri megnyomás után frissít az oldal
  8. lépés: helyes eredményt kaptam (A jogosultság vagy GUEST vagy ACCOMODATION lehet.)


