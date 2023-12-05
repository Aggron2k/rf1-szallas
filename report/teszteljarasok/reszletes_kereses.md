# Tesztjegyzőkönyv - Részletes keresés

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Részletes keresés` funkcióihoz készült. Felelőse: `Horváth Richárd Soma`

## 1. Teszteljárások (TP)

### 1.1. "Szállások besorolása" tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: "Szállások besorolása" tesztelése
    0. lépés: Nyissuk meg az oldalt, adjunk meg valós adatokat a keresőnek.
    1. lépés: Adjuk meg ugyanezeket az adatokat a "Hova", "Mettől", "Meddig" és a Személyek száma mezőben.
    2. lépés: Írjunk be megfelelő adatot a "Szállások besorolása" mezőbe
	3. lépés: Nyomjuk meg a keresés gombot
    4. lépés: Elvárt eredmény: A keresésnek megfelelő szállások jelennek meg

### 1.2. "Ellátás" tesztelése
- Azonosító: TP-02
- Tesztesetek: TC-03, TC-04
- Leírás: "Ellátás" tesztelése
    0. lépés: Nyissuk meg az oldalt, adjunk meg valós adatokat a keresőnek.
    1. lépés: Adjuk meg ugyanezeket az adatokat a "Hova", "Mettől", "Meddig" és a Személyek száma mezőben.
    2. lépés: Válasszuk ki a "teljes panzió" gombot
	3. lépés: Nyomjuk meg a keresés gombot
    4. lépés: Elvárt eredmény: A keresésnek megfelelő szállások jelennek meg

### 1.3. "Szolgáltatások" tesztelése
- Azonosító: TP-03
- Tesztesetek: TC-05, TC-06
- Leírás: "Szolgáltatások" tesztelése
    0. lépés: Nyissuk meg az oldalt, adjunk meg valós adatokat a keresőnek.
    1. lépés: Adjuk meg ugyanezeket az adatokat a "Hova", "Mettől", "Meddig" és a Személyek száma mezőben.
    2. lépés: Válasszuk ki a "Ingyenes WiFi" gombot
	3. lépés: Nyomjuk meg a keresés gombot
    4. lépés: Elvárt eredmény: A keresésnek megfelelő szállások jelennek meg

## 2. Tesztesetek (TC)

### 2.1. "Szállások besorolása" tesztelése

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: "Szállások besorolása" tesztelése megfelelő adatokkal
- Bemenet: 'Hova' = "Szeged"; 'Mettől' = "03/12/2023"; 'Meddig' = "05/12/2023"; 'Személyek száma' = "1"; 'Szállások besorolása' = "5 csillag";
- Művelet: Keresés gomb megnyomása
- Elvárt kimenet: A szűrésnek megfelelő szállások listája
#### 2.1.2. TC-02
- TP: TP-01
- Leírás: "Szállások besorolása" tesztelése nem megfelelő adatokkal
- Bemenet: 'Hova' = "Szeged"; 'Mettől' = "03/12/2023"; 'Meddig' = "05/12/2023"; 'Személyek száma' = "1"; 'Szállások besorolása' = "nem 5 csillag";
- Művelet: Keresés gomb megnyomása
- Elvárt kimenet: Hibaüzenet a nem megfelelő formátumról

### 2.2. "Ellátás" tesztelése

#### 2.2.1. TC-03
- TP: TP-02
- Leírás: "Ellátás" tesztelése
- Bemenet: 'Hova' = "Szeged"; 'Mettől' = "03/12/2023"; 'Meddig' = "05/12/2023"; 'Személyek száma' = "1"; 'Teljes panzió' = "Igaz";
- Művelet: Keresés gomb megnyomása
- Elvárt kimenet: A szűrésnek megfelelő szállások listája

#### 2.2.2. TC-04
- TP: TP-02
- Leírás: "Ellátás" tesztelése
- Bemenet: 'Hova' = "Szeged"; 'Mettől' = "03/12/2023"; 'Meddig' = "05/12/2023"; 'Személyek száma' = "1"; 'Fél panzió' = "Igaz";
- Művelet: Keresés gomb megnyomása
- Elvárt kimenet: A szűrésnek megfelelő szállások listája

### 2.3. "Szolgáltatások" tesztelése

#### 2.3.1. TC-05
- TP: TP-03
- Leírás: "Szolgáltatások" tesztelése
- Bemenet: 'Hova' = "Szeged"; 'Mettől' = "03/12/2023"; 'Meddig' = "05/12/2023"; 'Személyek száma' = "1"; 'Ingyenes WiFi' = "Igaz";
- Művelet: Keresés gomb megnyomása
- Elvárt kimenet: A szűrésnek megfelelő szállások listája

#### 2.3.2. TC-06
- TP: TP-03
- Leírás: "Szolgáltatások" tesztelése
- Bemenet: 'Hova' = "Szeged"; 'Mettől' = "03/12/2023"; 'Meddig' = "05/12/2023"; 'Személyek száma' = "1"; 'Parkolás' = "Igaz";
- Művelet: Keresés gomb megnyomása
- Elvárt kimenet: A szűrésnek megfelelő szállások listája

## 3. Tesztriportok (TR)

### 3.1. "Szállások besorolása" tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Megfelelő adatok megadása
    2. lépés: Keresés gomb megnyomása
    3. lépés: A keresésnek megfelelő szállások jelennek meg

#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: Megfelelő adatok megadása
    2. lépés: Keresés gomb megnyomása
    3. lépés: Hibaüzenet a nem megfelelő formátumról

### 3.2. "Ellátás" tesztriportjai

#### 3.2.1. TR-03 (TC-03)
- TP: TP-02
    1. lépés: Megfelelő adatok megadása
    2. lépés: Keresés gomb megnyomása
    3. lépés: A keresésnek megfelelő szállások jelennek meg

#### 3.2.2. TR-04 (TC-04)
- TP: TP-02
    1. lépés: Megfelelő adatok megadása
    2. lépés: Keresés gomb megnyomása
    3. lépés: A keresésnek megfelelő szállások jelennek meg

### 3.3. "Szolgáltatások" tesztriportjai

#### 3.3.1. TR-05 (TC-05)
- TP: TP-03
    1. lépés: Megfelelő adatok megadása
    2. lépés: Keresés gomb megnyomása
    3. lépés: A keresésnek megfelelő szállások jelennek meg

#### 3.3.2. TR-06 (TC-06)
- TP: TP-03
    1. lépés: Megfelelő adatok megadása
    2. lépés: Keresés gomb megnyomása
    3. lépés: A keresésnek megfelelő szállások jelennek meg

