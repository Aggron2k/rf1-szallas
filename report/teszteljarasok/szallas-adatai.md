# Tesztjegyzőkönyv-`Alapműveletek`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Szállás adatainak megjelenítése` funkcióihoz készült. Felelőse: `Rózsa István`

## 1. Teszteljárások (TP)

### 1.1. Szállás adatainak megjelenítése
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: szállás adatinak megjelenítése funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a kezdőoldalra
    1. lépés: Töltsük ki a keresési formot. Adjuk meg a feltételeket
    2. lépés: Ha van találat akkor válasszunk ki egy szállást.
    3. lépés: Kattintsak a `Részletek` gombra.
    6. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `Megjelennek a kiválasztott szállás adatai`
## 2. Teszesetek (TC)

### 2.1. Szállás adatai funkció tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: szállás keresés funkció tesztelése
- Bemenet: Keresési form feltételek megadása.
- Művelet: nyomjuk meg az `Részletek` gombot
- Elvárt kimenet: az eredmény mező tartalma: `Megjelennek a kiválasztott szállás adatai` = Megjelenik a szállás adata

## 3. Tesztriportok (TR)

### 3.1. Szállás adatai funkció tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: megadtam a keresési formon a feltételeket
    2. lépés: rányomtam a részletek gombra
    3. lépés: a gomb megnyomása után megkaptam a szállás adatait
    4. lépés: helyes eredményt kaptam (szállás adatai)