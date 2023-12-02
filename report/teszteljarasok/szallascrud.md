
# Tesztjegyzőkönyv - Szállás CRUD

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Szállás CRUD` funkcióihoz készült. Felelőse: `Kvak Barnabás Máté`

## 1. Teszteljárások (TP)

### 1.1. Szállás hozzáadása tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: Szállás hozzáadásának tesztelése
    0. lépés: Nyissuk meg az oldalt, jelentkezzünk be az oldalra ACCOMODATION jogú felhasználóval, majd a `Szállások kezelése` menü pontra kattintsunk rá.
    1. lépés: Töltse ki a szükséges információkat az új szállás létrehozásához
    2. lépés: Nyomjuk meg az `Hozzáadása` gombot
    3. lépés: Elvárt eredmény: Új szállás megjelenik a listában

### 1.2. Szállás adatainak módosítása tesztelése
- Azonosító: TP-02
- Tesztesetek: TC-03, TC-04
- Leírás: Szállás adatainak módosításának tesztelése
    0. lépés: Nyissuk meg az oldalt, jelentkezzünk be az oldalra ACCOMODATION jogú felhasználóval, majd a `Szállások kezelése` menü pontra kattintsunk rá.
    1. lépés: Válasszunk ki egy szállást a listából
    2. lépés: Módosítsuk a szállás adatait
    3. lépés: Nyomjuk meg az `Mentés` gombot
    4. lépés: Elvárt eredmény: Szállás adatai sikeresen frissültek

### 1.3. Szállás törlése tesztelése
- Azonosító: TP-03
- Tesztesetek: TC-05, TC-06
- Leírás: Szállás törlésének tesztelése
    0. lépés: Nyissuk meg az oldalt, jelentkezzünk be az oldalra ACCOMODATION jogú felhasználóval, majd a `Szállások kezelése` menü pontra kattintsunk rá.
    1. lépés: Válasszunk ki egy szállást a listából
    2. lépés: Nyomjuk meg a `Szállás törlése` gombot
    3. lépés: Elvárt eredmény: A kiválasztott szállás eltűnik a listából

## 2. Tesztesetek (TC)

### 2.1. Szállás hozzáadása tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Szállás hozzáadásának tesztelése
- Bemenet: `Irányítószám` = 1414; `Város` = Paks; `Utca` = Új utca; `Házszám` = 3; `Név` = Paks hotel; `Latitude` = 3413240; `Longitude` = 31412; `Leírás` = Szép hotel; `Típus` = Apartman;
- Művelet: Szállás hozzáadása gomb megnyomása
- Elvárt kimenet: Új szállás megjelenik a listában

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: Szállás hozzáadásának tesztelése
- Bemenet: `Irányítószám` = 1414; `Város` = ÜRESEN HAGYJUK; `Utca` = Új utca; `Házszám` = 3; `Név` = Paks hotel; `Latitude` = 3413240; `Longitude` = 31412; `Leírás` = Szép hotel; `Típus` = Apartman;
- Művelet: Szállás hozzáadása gomb megnyomása
- Elvárt kimenet: Hibaüzenet a hiányzó információkról

### 2.2. Szállás adatainak módosítása tesztesetei

#### 2.2.1. TC-03
- TP: TP-02
- Leírás: Szállás adatainak módosításának tesztelése
- Bemenet: `Irányítószám` = 1415; `Város` = Pécs; `Utca` = Régi utca; `Házszám` = 4; `Név` = Pécs hotel; `Latitude` = 3413241; `Longitude` = 314121; `Leírás` = Jó hotel; `Típus` = Szálloda;
- Művelet: Mentés gomb megnyomása
- Elvárt kimenet: Szállás adatai sikeresen frissültek

#### 2.2.2. TC-04
- TP: TP-02
- Leírás: Szállás adatainak módosításának tesztelése
- Bemenet: `Irányítószám` = ÜRESEN HAGYJUK; `Város` = Pécs; `Utca` = Régi utca; `Házszám` = 4; `Név` = Pécs hotel; `Latitude` = 3413241; `Longitude` = 314121; `Leírás` = Jó hotel; `Típus` = Szálloda;
- Művelet: Adatok frissítése gomb megnyomása
- Elvárt kimenet: Hibaüzenet a hiányzó információkról

### 2.3. Szállás törlése tesztesetei

#### 2.3.1. TC-05
- TP: TP-03
- Leírás: Szállás törlésének tesztelése
- Bemenet: `Deák panzió` Szállás kiválasztása
- Művelet: Törlése gomb megnyomása
- Elvárt kimenet: A kiválasztott szállás eltűnik a listából

#### 2.3.2. TC-06
- TP: TP-03
- Leírás: Szállás törlésének tesztelése
- Bemenet: `Pécs Hotel` Szállás kiválasztása törlés gomb megnyomása
- Művelet: Törlés gomb megnyomása
- Elvárt kimenet: A kiválasztott szállás eltűnik a listából

## 3. Tesztriportok (TR)

### 3.1. Szállás hozzáadása tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Szállás információinak kitöltése
    2. lépés: Szállás hozzáadása gomb megnyomása
    3. lépés: Új szállás megjelenik a listában

#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: Szállás információinak hiányos kitöltése
    2. lépés: Szállás hozzáadása gomb megnyomása
    3. lépés: Hibaüzenet a hiányzó információkról

### 3.2. Szállás adatainak módosítása tesztriportjai

#### 3.2.1. TR-01 (TC-03)
- TP: TP-02
    1. lépés: Szállás kiválasztása, adatok módosítása
    2. lépés: Adatok frissítése gomb megnyomása
    3. lépés: Szállás adatai sikeresen frissültek

#### 3.2.2. TR-02 (TC-04)
- TP: TP-02
    1. lépés: Szállás kiválasztása, hiányos adatok módosítása
    2. lépés: Adatok frissítése gomb megnyomása
    3. lépés: Hibaüzenet a hiányzó információkról

### 3.3. Szállás törlése tesztriportjai

#### 3.3.1. TR-01 (TC-05)
- TP: TP-03
    1. lépés: Szállás kiválasztása, törlés gomb megnyomása
    2. lépés: Törlés gomb megnyomása
    3. lépés: A kiválasztott szállás eltűnik a listából

#### 3.3.2. TR-02 (TC-06)
- TP: TP-03
    1. lépés: Szállás kiválasztása, törlés gomb megnyomása
    2. lépés: Törlés gomb megnyomása
    3. lépés: A kiválasztott szállás eltűnik a listából

