# Tesztjegyzőkönyv-`Alapműveletek`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Képfeltöltés` funkcióihoz készült. Felelőse: `Rózsa István`

## 1. Teszteljárások (TP)

### 1.1. Képfeltöltés
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: képfeltöltés funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és jelentkezzünk be
    1. lépés: Menjünk a képfeltöltés menüpontra ha Szállás adók vagyunk
    2. lépés: Válasszuk ki a szállást ahová képet szeretnénk feltölteni
    3. lépés: Tallózuk a képet
    4. lépés: Kattintsunk a `Mentés` gombra
    5. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `Sikeres képfeltöltés`
## 2. Teszesetek (TC)

### 2.1. Képfeltöltés funkció tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás:  képfeltöltés funkció tesztelése
- Bemenet: Kiválasztott szállás, Tallózott kép
- Művelet: nyomjuk meg az `Mentés` gombot
- Elvárt kimenet: az eredmény mező tartalma: `Sikeres képfeltöltés` = Sikeres képfeltöltés

## 3. Tesztriportok (TR)

### 3.1. Képfeltöltés funkció tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Kiválasztottam a szállást
    2. lépés: Tallóztam egy képet
    3. lépés: a gomb megnyomása után feltöltődött a kép
    4. lépés: helyes eredményt kaptam (Sikeres képfeltöltés)