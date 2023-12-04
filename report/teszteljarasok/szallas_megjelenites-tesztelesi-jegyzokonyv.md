# Tesztjegyzőkönyv-`Szállás Megjelenites`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Szállás Megjelenites` funkcióihoz készült. Felelőse: `Hörömpő Márk`

## 1. Teszteljárások (TP)

### 1.1. Szállás Megjelenites tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: Szallas megjelenítés funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a kezdőoldalra
    1. lépés: Használjuk a Szállás Keresés funkciót
    2. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `A szállás keresés funkcióban alkalmazott feltételeknek megfelelő szállások megjelennek`
## 2. Teszesetek (TC)

### 2.1. Szállás megjelenites funkció tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Szállás megjelenítés funkció tesztelése
- Bemenet: Szállás Keresés funkcióban használt bemenetek
- Művelet: nyomjuk meg az `Keresés` gombot
- Elvárt kimenet: `A keresési feltételeknek megfelelő szállások` = Megjelennek a keresési feltételeknek megfelelő szállások

## 3. Tesztriportok (TR)

### 3.1. Szállás keresés funkció tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: A Keresési Funkcióban megadtam a feltételeket
    2. Megnyomtam a Keresés Gombot
    3. Megjelentek a kívánt szállások