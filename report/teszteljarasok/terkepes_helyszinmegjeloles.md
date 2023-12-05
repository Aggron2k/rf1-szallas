# Tesztjegyzőkönyv-`Térképes helyszínmegjelölés`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Térképes helyszínmegjelölés` funkcióihoz készült. Felelőse: `Horváth Richárd Soma`

## 1. Teszteljárások (TP)

### 1.1. Szállás adatainak megjelenítése
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: 
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a kezdőoldalra
    1. lépés: Töltsük ki a keresési formot. Adjuk meg a feltételeket
    2. lépés: Ha van találat akkor válasszunk ki egy szállást.
    3. lépés: Kattintsak a `Részletek` gombra.
    6. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `Megjelenik a térképen a megfelelő helyszín`
## 2. Teszesetek (TC)

### 2.1. Szállás adatai funkció tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: szállás keresés funkció tesztelése
- Bemenet: Keresési form feltételek megadása.
- Művelet: nyomjuk meg az `Részletek` gombot
- Elvárt kimenet: az eredmény mező tartalma: `Megjelenik a térképen a megfelelő helyszín` = Megjelenik a megfelelő helyszín

## 3. Tesztriportok (TR)

### 3.1. Szállás adatai funkció tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: megadtam a keresési formon a feltételeket
    2. lépés: rányomtam a részletek gombra
    3. lépés: a gomb megnyomása után megkaptam a térképet a helyszínnel
    4. lépés: helyes eredményt kaptam (a megfelelő helyszínt a térképen)