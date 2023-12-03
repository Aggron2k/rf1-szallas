# Tesztjegyzőkönyv-`Értékelés`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `Értékelés` funkcióihoz készült.   
Felelőse: `Hajas Attila István`

## 1. Teszteljárások (TP)

### 1.1. Értékelés tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: foglalási folyamat tesztelése
    1. lépés: Regisztráljunk az alkalmazásba, jelentkezzünk be
    2. Keressünk rá a szállásra megfelelő adatok alapján, majd válasszuk ki a szállást
    3. lépés: Nyomjunk meg egy `⭐` gombot 1-5 között.
    6. lépés: Ellenőrizzük az eredményt.   
       Elvárt eredmény: `Egyszer tudunk szavazni, frissítés után látszik mennyi csillagot adtunk`

## 2. Teszesetek (TC)
#### 2.1. TC-01
- TP: TP-01
- Leírás: Értékelés funkció helyes működése
- Bemenet: Regisztráció és bejelentkezés után válasszuk ki a szállást.
Nyomjunk meg egy ⭐ gombot.
- Művelet: Ellenőrizzük az értékelés sikerességét és a csillagok megjelenését. Az oldal frissítése után megjelenik
- Elvárt kimenet: Egyszer tudunk szavazni, frissítés után látszik, hány csillagot adtunk(egy ebben az esetben).

#### 2.2. TC-02
- TP: TP-01
- Leírás: Értékelés megkísérlése regisztráció és bejelentkezés nélkül
- Bemenet: Látogatóként válasszuk ki a szállást.
- Művelet: Próbáljuk megkeresni a csillagokat és rányomni.
- Elvárt kimenet: Nem jelennek meg a ⭐ gombok.
