# Tesztjegyzőkönyv-`Alapműveletek`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Regisztráció` funkcióihoz készült. Felelőse: `Kele Dominik Norbert`

## 1. Teszteljárások (TP)

### 1.1. Regisztráció tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02, TC-03, TC-04, TC-05, TC-06
- Leírás: összeadás funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a bejelentkezés oldalra
    1. lépés: A `Vezetéknév` szövegbeviteli mezőbe írjunk be egy vezetéknevet
    2. lépés: A `Keresztnév` szövegbeviteli mezőbe írjunk be egy keresztnevet
    3. lépés: A `Email` szövegbeviteli mezőbe írjunk be egy emailt
    4. lépés: A `Felhasználónév` szövegbeviteli mezőbe írjunk be egy felhasználónevet
    5. lépés: A `Jelszó` szövegbeviteli mezőbe írjunk be egy jelszót
    6. lépés: A `Jogosultság` szövegbeviteli mezőbe írjunk be egy jogosutságot
    7. lépés: Nyomjuk meg az `Regisztráció` gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `URL-be kiírja, hogy register/?succes`
