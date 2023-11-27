# Tesztjegyzőkönyv-`Alapműveletek`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Szállás keresés` funkcióihoz készült. Felelőse: `Hörömpő Márk`

## 1. Teszteljárások (TP)

### 1.1. Szállás keresés tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: összeadás funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a kezdőoldalra
    1. lépés: A `Hova` szövegbeviteli mezőbe írjunk be egy város nevet
    2. lépés: A `Mettől` dátum mezőbe válasszunk ki egy dátumot
    3. lépés: A `Meddig` dátum mezőbe válasszunk ki egy dátumot
    4. lépés: A `Személyek száma` szövegbeviteli mezőbe írjunk be egy számot
    5. lépés: Nyomjuk meg az `Keresés` gombot 
    6. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `A keresési feltételeknek megfelelő szállások`
## 2. Teszesetek (TC)

### 2.1. Összeadás funkció tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: szállás keresés funkció tesztelése 
- Bemenet: `Hova` = Szeged ; `Mettől` = 2023-11-27 ; `Meddig` = 2023-11-28 ; `Személyek száma` = 2
- Művelet: nyomjuk meg az `Keresés` gombot 
- Elvárt kimenet: az eredmény mező tartalma: `A keresési feltételeknek megfelelő szállások` = Megjelennek a keresési feltételeknek megfelelő szállások

## 3. Tesztriportok (TR)

### 3.1. Összeadás funkció tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: 0-t beírtam
    2. lépés: 3-t beírtam 
    3. lépés: a gomb egyszeri megnyomás után inaktív lett
    4. lépés: helyes eredményt kaptam (3)
    

#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: X-t beírtam
    2. lépés: 3-t beírtam 
    3. lépés: a gomb egyszeri megnyomás után inaktív lett
    4. lépés: helyes eredményt kaptam (HIBA)

### 3.2. Négyzetre emelés funkció tesztriportjai

#### 3.2.1. TR-01 (TC-01)
- TP: TP-02
    1. lépés: 2-t beírtam
    2. lépés: a gomb egyszeri megnyomás után inaktív lett
    3. lépés: helyes eredményt kaptam (4)