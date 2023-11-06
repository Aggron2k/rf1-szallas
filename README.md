# `Szállás` Projektterv `2023`

## 1. Összefoglaló

`A szállásfoglaló projekt célja egy modern weboldal létrehozása, amely lehetővé teszi a felhasználók számára, hogy könnyedén keressenek és foglaljanak szállást. Az oldal szállásokat kínál országszerte, így utazók és turisták egyszerűen találhatnak megfelelő szállást az igényeiknek megfelelően. Az online platform kínálja az elérhető szállások részletes leírását, árait, valamint vendégértékeléseket, hogy segítse a felhasználókat a legjobb döntés meghozatalában. A weboldal segítségével a szállások egyszerűbben elérhetőek, és a foglalás folyamata gyorsabb és kényelmesebb, hozzájárulva ezzel az utazási élmény javításához és a vendégek elégedettségéhez.`

## 2. A projekt bemutatása

`Ez a projektterv a szállásfoglalás projektet mutatja be, amely 2023-09-22-től 2023-12-04-ig tart, azaz összesen 73 napon keresztül fog futni. A projekten hét fejlesztő fog dolgozni, az elvégzett feladatokat pedig négy alkalommal fogjuk prezentálni a megrendelőnek, annak érdekében, hogy biztosítsuk a projekt folyamatos előrehaladását.`

### 2.1. Rendszerspecifikáció

`A projekt célja egy komplex szállásfoglalási és szállásadási rendszer kifejlesztése, amelyben a felhasználók szállásokat kereshetnek, értékelhetnek és foglalhatnak. A rendszerben szállásadók és szállásfoglalók számára elérhető bejelentkezés és regisztráció. A felhasználók számára funkciók állnak rendelkezésre, mint például szállások keresése, értékelések írása (csillagos és szöveges formában), foglalások kezelése, felkapott úti célok böngészése, legolcsóbb szállások keresése, valamint legutóbbi keresett szálláshelyek megtekintése. A szállásadók saját felületen adhatnak hozzá, szerkeszthetnek és törölhetnek szállásokat, feltölthetnek képeket, és részletes leírásokat adhatnak meg, beleértve a megközelítést, felszereltséget, akadálymentesítést, férőhelyeket és szolgáltatásokat. Az adatbázis tartalmazza a szállások, felhasználók és foglalások kezelését, a funkcionalitást pedig megfelelő felhasználói jogosultságok biztosítják a hatékony és biztonságos működéshez.`

### 2.2. Funkcionális követelmények

- `Szállás foglaló:`
  - `Regisztráció`
  - `Bejelentkezés`
  - `Személyes adatok módosítása`
  - `Szállás keresés: `
    - `Szállások megjelenítése`
    - `Szűrés lehetősége hely, időpont, felnőtt/gyerek, szobák száma szerint`
    - `Felkapott úticélok, legolcsóbb szálláshelyek gyors keresése`
  - `Szállás helyek értékelése:`
    - `Szöveges és csillagos értékelés`
  - `Foglalás`
    - `Szállás kiválasztása, Személyes adatok kitöltése, foglalás véglegesítése`
    - `Saját foglalások kezelése`

- `Szállás adó:`
  - `Regisztráció`
  - `Bejelentkezés`
  - `Személyes adatok módosítása`
  - `Kiadó szállás létrehozása, módosítása, törlése`
  - `Kiadó szállás adatainak megadása`
  - `Képfeltöltés a szálláshoz`

### 2.3. Nem funkcionális követelmények

- `A kliens oldal böngészőfüggetlen legyen`
- `Reszponzív és modern megjelenés`
- `Az érzékeny adatokat biztonságosan tároljuk`
- `A legfrissebb technológiákat használja a rendszer`
- `Egyszerűen használhatónak és felhasználóbarátnak kell lennie.`


## 3. Költség- és erőforrás-szükségletek

Az erőforrásigényünk összesen `140` személynap, átlagosan `20` személynap/fő.

A rendelkezésünkre áll összesen `7 * 70 = 490` pont.

## 4. Szervezeti felépítés és felelősségmegosztás

A projekt megrendelője `Szegedi Tudományegyetem`. A `Szállásfoglalás` projektet a projektcsapat fogja végrehajtani, amely `jelenleg hét fejlesztőből áll. A csapatban található tapasztalt és pályakezdő webprogramozó is, A tapasztalt projekttagok több éve dolgoznak az iparban, számos sikeres projektten vannak túl.`

- `Rózsa István (3 év PHP fullstack tapasztalat, magánvállalkozóként)`
- `Kele Dominik (1 év Angular, TypeScript, Drupal a DataStepSolution-nél)`
- `Hörömpő Márk (Különböző frontend és dizájn téren freelancer tapasztalat /Figma, Adobe Illustrator, CSS/)`
- `Horváth Richárd (Nincs korábbi tapasztalat)`
- `Horváth Krisztián (PHP alapú weboldal tervezése, UX dizájn - Figma, CSS, JavaScript, Adatbázis kezelés - MySQL)`
- `Kvak Barnabás (Foster Media)`
- `Hajas Attila (Logiscool: javascript, python, python ML, Uj dimenzio butor kft weboldala: php, tailwind)`

### 4.1 Projektcsapat

A projekt a következő emberekből áll:

| Név                 | Pozíció          | E-mail cím (stud-os)       |
| ------------------- | ---------------- | -------------------------- |
| `Rózsa István`      | Projektmenedzser | `h163484@stud.u-szeged.hu` |
| `Kele Dominik`      | Projekt tag      | `h159581@stud.u-szeged.hu` |
| `Hajas Attila`      | Projekt tag      | `h983088@stud.u-szeged.hu` |
| `Horváth Krisztián` | Projekt tag      | `h158795@stud.u-szeged.hu` |
| `Horváth Richárd`   | Projekt tag      | `h158829@stud.u-szeged.hu` |
| `Kvak Barnabás`     | Projekt tag      | `h160654@stud.u-szeged.hu` |
| `Hörömpő Márk`      | Projekt tag      | `h159013@stud.u-szeged.hu` |

## 5. A munka feltételei

### 5.1. Munkakörnyezet

A projekt során mindenki a saját munkaállomását fogja használni a munka során:

- `Munkaállomások: 5 db, Windows 10-es operációs rendszerrel, 2db, Ubuntum opercáiós rendszerrel felruházott`
- `Asztali számítógép (CPU: Ryzen 5 5600G, RAM: 8GB, GPU: Radeon Graphics(beépített grafikus vezérlő))`
- `Asztali számítógép (CPU: Ryzen 5 3500X, RAM: 16GB, GPU: Nvidia RTX3070)`
- `Asztali számítógép (CPU: i5 11400, RAM: 8GB, GPU: Intel UHD Graphics 730)`
- `Asztali számítógép (CPU: i5 1135G7, RAM: 16GB, GPU: Intel Iris Xe)`
- `Laptop (CPU: i3-10100, RAM: 8GB, GPU: Intel UHD Graphics 630)`
- `Asztali számítógép (CPU: Ryzen 3 3300X, RAM: 8GB, GPU: Integrált AMD Radeon Vega Graphics)`
- `Asztali számítógép (CPU: Ryzen 5 3600, RAM: 16GB, GPU: Radeon RX 5600 XT)`

A projekt a következő technológiákat/szoftvereket fogja használni a munka során:

- `Visual Studio Code kódszerkesztő`
- `Git verziókövető (GitLab)`
- `Java Spring`
- `Thymeleaf`
- `MySQL` 

### 5.2. Rizikómenedzsment

| Kockázat                                    | Leírás                                                                                                                                                                                                                  | Valószínűség | Hatás  |
| ------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------ | ------ |
| `Betegség`                                  | `Előfordulhat hogy egy vagy több csapattagunk beteglesz, ilyenkor személyes csoportgyűlések nem megoldható és lassítja vagy teljesen hátráltatja a fejlesztést. Megoldás: a feladatok átcsoportosítása`                 | `nagy`       | `erős` |
| `Kommunikációs fennakadás a csapattagokkal` | `Ha a feladatok és azok kezelése nem megfelelően kommunikálódik a csapatban, az vezethet a félreértésekhez vagy a kezelés elmulasztásához. Megoldás: még gyakoribb megbeszélések és ellenőrzések`                       | `kis`        | `erős` |
| `Rossz internet kapcsolat`                  | `Fejlesztés közben fontos a folytonos jól működő internet kapcsolat, ennek hiánya hátráltatja a fejlesztést, megnehezíti a kommunikációt, fejlesztés során végzett kutatásokat, gitlabon keresztül végzett műveleteket` | `közepes`    | `erős` |
| `Munkakörnyezet hiánya`                     | `Előfordulhat a csapattagok között hogy valaki elutazik és nincs hordozható eszköze amin tudna fejleszteni. Megoldás: a feladatok átcsoportosítása vagy határidő kitolása`                                              | `erős`       | `erős` |

## 6. Jelentések

### 6.1. Munka menedzsment

A munkát `Rózsa István` koordinálja. `Fő feladata, a csapat és munkájuk felügyelése, fellépő problémák kezelése. Tovibbái feladata a csoportgyűlések szervezése Messengeren, csapatgyűlés levezényelése Discordon.`

### 6.2. Csoportgyűlések

`A csoport hetente ülésezik tervezetten minden pénteken, hogy megvitassák az azt megelőző hét problémáit, illetve hogy megbeszéljék a következő hét feladatait. A megbeszélésről minden esetben memó készül.`

`1. megbeszélés:`

- `Időpont: 2023.09.22.`
- `Hely: Discord`
- `Résztvevők: Rózsa István, Hörömpő Márk, Horváth Krisztián, Horváth Richárd, Kvak Barnabás, Attila hajas, Dominik Kele`
- `Érintett témák: Ismerkedés, projekttéma kiválasztása, GitLab beüzemelése, kisebb feladatok kiosztása`

`2. megbeszélés:`

- `Időpont: 2023.09.29.`
- `Hely: Discord`
- `Résztvevők: Rózsa István, Hörömpő Márk, Horváth Krisztián, Horváth Richárd, Kvak Barnabás, Attila hajas, Dominik Kele`
- `Érintett témák: Tovibbái mérföldkövek átbeszélése, feladatok és issuek kiosztása, keretrendszer megbeszélése`

`3. megbeszélés:`

- `Időpont: 2023.10.06.`
- `Hely: Discord`
- `Résztvevők: Rózsa István, Hörömpő Márk, Horváth Krisztián, Horváth Richárd, Kvak Barnabás, Attila hajas, Dominik Kele`
- `Érintett témák: Projekt terv átbeszélése, módosítások, issuek rendezése, feladatok kiosztása`

`4. megbeszélés:`

- `Időpont: 2023.10.13.`
- `Hely: Discord`
- `Résztvevők: Rózsa István, Hörömpő Márk, Horváth Krisztián, Horváth Richárd, Kvak Barnabás, Attila hajas, Dominik Kele`
- `Érintett témák: Első mérföldkő véglegesítése, PowerPoint bemutató áttekintése, egyéni jelentések létrehozása`

`5. megbeszélés:`

- `Időpont: 2023.10.20.`
- `Hely: Discord`
- `Résztvevők: Rózsa István, Hörömpő Márk, Horváth Krisztián, Horváth Richárd, Kvak Barnabás, Attila hajas, Dominik Kele`
- `Érintett témák: Elkészült diagrammok megbeszélése, javítása(Squence diagram, Egyed-kapcsolat stb.)`

`6. megbeszélés:`

- `Időpont: 2023.10.29.`
- `Hely: Discord`
- `Résztvevők: Rózsa István, Hörömpő Márk, Horváth Krisztián, Horváth Richárd, Kvak Barnabás, Attila hajas, Dominik Kele`
- `Érintett témák: Minden Második Mérföldkővel kapcsolatos Issue lezárása, jövőbeli tervek átbeszélése`

### 6.3. Minőségbiztosítás

Az elkészült terveket a terveken nem dolgozó csapattársak közül átnézik, hogy megfelel-e a specifikációnak és az egyes diagramtípusok összhangban vannak-e egymással. A meglévő rendszerünk helyes működését a prototípusok bemutatása előtt a tesztelési dokumentumban leírtak végrehajtása alapján ellenőrizzük és összevetjük a specifikációval, hogy az elvárt eredményt kapjuk-e. További tesztelési lehetőségek: unit tesztek írása az egyes modulokhoz vagy a kód közös átnézése (code review) egy, a vizsgált modul programozásában nem résztvevő csapattaggal. Szoftverünk minőségét a végső leadás előtt javítani kell a rendszerünkre lefuttatott kódelemzés során kapott metrikaértékek és szabálysértések figyelembevételével.
Az alábbi lehetőségek vannak a szoftver megfelelő minőségének biztosítására:

- Specifikáció és tervek átnézése (kötelező)
- Teszttervek végrehajtása (kötelező)
- Unit tesztek írása (választható)
- Kód átnézése (választható)

### 6.4. Átadás, eredmények elfogadása

A projekt eredményeit a megrendelő, `Dr. Pflanzner Tamás` fogja elfogadni. A projektterven változásokat csak a megrendelő írásos engedélyével lehet tenni. A projekt eredményesnek bizonyul, ha specifikáció helyes és határidőn belül készül el. Az esetleges késések pontlevonást eredményeznek.
Az elfogadás feltételeire és beadás formájára vonatkozó részletes leírás a következő honlapon olvasható: https://okt.inf.szte.hu/rf1/

### 6.5. Státuszjelentés

Minden mérföldkő leadásnál a projekten dolgozók jelentést tesznek a mérföldkőben végzett munkájukról a a megadott sablon alapján. A gyakorlatvezetővel folytatott csapatmegbeszéléseken a csapat áttekintik és felmérik az eredményeket és teendőket. Továbbá gazdálkodnak az erőforrásokkal és szükség esetén a megrendelővel egyeztetnek a projektterv módosításáról.

## 7. A munka tartalma

### 7.1. Tervezett szoftverfolyamat modell és architektúra

`A szoftver fejlesztése során az agilis fejlesztési modellt alkalmazzuk, mivel a fejlesztés során nagy hangsúlyt fektetünk a folyamatos kommunikcióra. A fejlesztés során a szoftver specifikációi rugalmasan vátozhatnak, és ezzel a módszertannal tudunk a leggyorsabban alkalmazkodni az új elvárásokhoz.`

`A webalkalmazás az MVC (modell-view-controller) felépítést követi.`

```
Milyen szoftverfolyamat modellt követve állítja elő a csapat a specifikációnak megfelelő prototípusokat? Miért ezt választja?
A csapat milyen architektúrát választ a projekt megvalósításához? Milyen rétegek (logikai, adat, GUI) lesznek?`
```

### 7.2. Átadandók és határidők

A főbb átadandók és határidők a projekt időtartama alatt a következők:

| Szállítandó |                                 Neve                                  |  Határideje  |
| :---------: | :-------------------------------------------------------------------: | :----------: |
|     D1      |       Projektterv és Gantt chart, prezentáció, egyéni jelentés        | `2023-10-16` |
|    P1+D2    |    UML, adatbázis- és képernyőtervek, prezentáció, egyéni jelentés    | `2023-10-30` |
|    P1+D3    |       Prototípus I. és tesztelési dokumentáció, egyéni jelentés       | `2023-11-20` |
|    P2+D4    | Prototípus II. és frissített tesztelési dokumentáció, egyéni jelentés | `2023-12-04` |

```
D - dokumentáció, P - prototípus
```

## 8. Feladatlista

A következőkben a tervezett feladatok részletes összefoglalása található.

### 8.1. Projektterv (1. mérföldkő)

Ennek a feladatnak az a célja, hogy `megvalósításhoz szükséges lépéseket, az erőforrásigényeket, az ütemezést, a felelősöket és a feladatok sorrendjét meghatározzuk, majd vizualizáljuk Gantt diagram segítségével.`

Részfeladatai a következők:

#### 8.1.1. Projektterv kitöltése

Felelős: `Rózsa István`

Tartam: `4 nap`

Erőforrásigény: `1 személynap/fő`

#### 8.1.2. Bemutató elkészítése

Felelős: `Kvak Barnabás Máté`

Tartam: `2 nap`

Erőforrásigény: `0.5 személynap`

Mérföldkő: [Első mérföldkő](https://git-okt.sed.inf.szte.hu/2023_ib153i-10_d/rf-szallas/-/milestones/1#tab-issues)

```
A mérföldkőhöz tartozó feladatok bemutatása PPT keretében, pl. téma, tervezett funkciók, tagok, Gantt diagram.`
```

### 8.2. UML és adatbázis- és képernyőtervek (2. mérföldkő)

Ennek a feladatnak az a célja, hogy `a rendszerarchitektúrát, az adatbázist és webalkalmazás kinézetét megtervezzük.`

Részfeladatai a következők:

#### 8.2.1. Use Case diagram

Felelős: `Hajas Attila István`

Tartam: `3 nap`

Erőforrásigény: `1 személynap`

#### 8.2.2. Class diagram

Felelős: `Rózsa István Ferenc`

Tartam: `4 nap`

Erőforrásigény: `2 személynap`

#### 8.2.3. Sequence diagram

Felelős: `Kvak Barnabás`

Tartam: `3 nap`

Erőforrásigény: `2 személynap`

#### 8.2.4. Egyed-kapcsolat diagram adatbázishoz

Felelős: `Kele Dominik`

Tartam: `4 nap`

Erőforrásigény: `2 személynap`

#### 8.2.5. Package diagram

Felelős: `Horváth Richárd Soma`

Tartam: `3 nap`

Erőforrásigény: `0.5 személynap`

#### 8.2.6. Képernyőtervek

Felelős: `Hörömpő Márk`

Tartam: `3 nap`

Erőforrásigény: `1 személynap`

#### 8.2.7. Bemutató elkészítése

Felelős: `Kvak Barnabás`

Tartam: `1 nap`

Erőforrásigény: `0.5 személynap`

```
A mérföldkőhöz tartozó feladatok bemutatása PPT keretében (elkészült diagramok és képernyőtervek)`
```

### 8.3. Prototípus I. (3. mérföldkő)

Ennek a feladatnak az a célja, hogy `egy működő prototípust hozzunk létre, ahol a vállalt funkcionális követelmények nagy része már prezentálható állapotban van.`

Részfeladatai a következők:

#### `8.3.1. Felhasználók kezelése (szállásadó, szállás foglaló) (CR)`

Felelős: `Kele Dominik`

Tartam: `5 nap`

Erőforrásigény: `2 személynap`

#### `8.3.2. Felhasználók kezelése (szállásadó, szállás foglaló) (UD)`

Felelős: `Kele Dominik`

Tartam: `4 nap`

Erőforrásigény: `2 személynap`

#### `8.3.3. Felhasználók kezeléséhez szükséges adatok létrehozása az adatbázisban`

Felelős: `Kele Dominik`

Tartam: `3 nap`

Erőforrásigény: `1 személynap`

#### `8.3.4. Felhasználói munkamenet megvalósítása több jogosultsági szinttel`

Felelős: `Kele Dominik`

Tartam: `10 nap`

Erőforrásigény: `2 személynap`

#### `8.3.5. Szállások keresése`

Felelős: `Hörömpő Márk`

Tartam: `3 nap`

Erőforrásigény: `1 személynap`

#### `8.3.6. Szálláskezeléshez szükséges adatok létrehozása az adatbázisban`

Felelős: `Hörömpő Márk`

Tartam: `4 nap`

Erőforrásigény: `2 személynap`

#### `8.3.7. Szállások megjelenítése`

Felelős: `Hörömpő Márk`

Tartam: `4 nap`

Erőforrásigény: `2 személynap`

#### `8.3.8. Szállások adatlapja`

Felelős: `Rózsa István`

Tartam: `3 nap`

Erőforrásigény: `1 személynap`

#### `8.3.9. Foglalás`

Felelős: `Hajas Attila`

Tartam: `5 nap`

Erőforrásigény: `2 személynap`

#### `8.3.10. Szálláshelyek értékelése`

Felelős: `Hajas Attila`

Tartam: `5 nap`

Erőforrásigény: `2 személynap`

#### `8.3.11. Szállások (CRUD)`

Felelős: `Kvak Barnabás`

Tartam: `3 nap`

Erőforrásigény: `2 személynap`

#### `8.3.12. Képfeltöltés a szálláshoz`

Felelős: `Rózsa István`

Tartam: `4 nap`

Erőforrásigény: `2 személynap`

#### `8.3.13. Térképes helyszínmegjelölés`

Felelős: `Horváth Richárd Soma`

Tartam: `5 nap`

Erőforrásigény: `2 személynap`

#### `8.3.14. Szállás részletes keresése`

Felelős: `Horváth Richárd Soma`

Tartam: `3 nap`

Erőforrásigény: `1 személynap`

#### `8.3.15. Szállás leírás kezelése(Megközelítés, Felszereltség, Férőhely ..stb)`

Felelős: `Kvak Barnabás`

Tartam: `4 nap`

Erőforrásigény: `2 személynap`

#### `8.3.16. Felhasználó foglalásainak kezelése (CRUD)`

Felelős: `Horváth Krisztián`

Tartam: `5 nap`

Erőforrásigény: `3 személynap`

#### `8.3.17. Személyes adatok (CRUD)`

Felelős: `Horváth Krisztián`

Tartam: `3 nap`

Erőforrásigény: `1 személynap`

#### 8.3.18. Tesztelési dokumentum az összes funkcióhoz (TP, TC)

Felelős: `Mindenki`

Tartam: `7 nap`

Erőforrásigény: `1 személynap/fő`


#### `8.3.19. A prototípus kitelepítése éles környezetbe`

Felelős: `Mindenki`

Tartam: `1 nap`

Erőforrásigény: `1 személynap`


### 8.4. Prototípus II. (4. mérföldkő)

Ennek a feladatnak az a célja, hogy `az előző mérföldkő hiányzó funkcióit pótoljuk, illetve a hibásan működő funkciókat és az esetlegesen felmerülő új funkciókat megvalósítsuk. Továbbá az alkalmazás alapos tesztelése is a mérföldkőben történik az előző mérföldkőben összeállított tesztesetek alapján.`

Részfeladatai a következők:

#### 8.4.1. Regisztráció tesztelése

Felelős: `Kele Dominik`

Tartam: `5 nap`

Erőforrásigény: `2.5 személynap`

#### 8.4.2. Bejelentkezés tesztelése

Felelős: `Kele Dominik`

Tartam: `5 nap`

Erőforrásigény: `2 személynap`

#### 8.4.3. Szállás (CRUD) tesztelése

Felelős: `Kvak Barnabás Máté`

Tartam: `5 nap`

Erőforrásigény: `1.5 személynap`

#### `8.4.4. Képfeltöltés tesztelése`

Felelős: `Rózsa István`

Tartam: `1 nap`

Erőforrásigény: `1 személynap`

#### `8.4.5. Térképes szállásmegjelölés tesztelése`

Felelős: `Horváth Richárd`

Tartam: `1 nap`

Erőforrásigény: `0.5 személynap`

#### `8.4.6. Szállás leírás kezelésének tesztelése`

Felelős: `Kvak Barnabás Máté`

Tartam: `1 nap`

Erőforrásigény: `1 személynap`

#### `8.4.7. Szállás keresés tesztelése

Felelős: `Hörömpő Márk`

Tartam: `1 nap`

Erőforrásigény: `0.5 személynap`

#### `8.4.8. Szállás megjelenítés tesztelése`

Felelős: `Hörömpő Márk`

Tartam: `1 nap`

Erőforrásigény: `0.5 személynap`

#### `8.4.9. Szállás részletes keresésének tesztelése`

Felelős: `Horváth Richárd`

Tartam: `1 nap`

Erőforrásigény: `0.5 személynap`

#### `8.4.10. Szállás adatainak tesztelése

Felelős: `Rózsa István`

Tartam: `1 nap`

Erőforrásigény: `0.5 személynap`

#### `8.4.11. Foglalás tesztelése

Felelős: `Hajas Attila`

Tartam: `1 nap`

Erőforrásigény: `0.5 személynap`

#### `8.4.12. Felhasználó foglalásainak kezelésének (CRUD) tesztelése

Felelős: `Horvát Krisztián`

Tartam:  `1 nap`

Erőforrásigény:  `0.5 személynap`

#### `8.4.13. Személyes adatok tesztelése

Felelős: `Horváth Krisztián`

Tartam:  `1 nap`

Erőforrásigény:  `0.5 személynap`

#### `8.4.14. Szálláshely értékelésének tesztelése

Felelős: `Hajas Attila`

Tartam: `1 nap`

Erőforrásigény: `0.5 személynap`

```
Működő végleges program, a frissített tesztelési dokumentációval. A 3. mérföldkőhöz képest funkiconálisan többet kell tudnia az oldalnak.

```

## 9. Részletes időbeosztás

![image](diagrams/gantt-diagram.PNG/gantt-diagram.PNG)


## 10. Projekt költségvetés

```
A projekt költségterv elkészítése során rögzítjük az egyes feladatokhoz szükséges erőforrások és költségek összegét, valamint az elvállalt feladatok számát. Az alábbi táblázatok segítenek a költségvetés kialakításában, és minden csapattag számára részletes információkat tartalmaznak.
```

### 10.1. Részletes erőforrásigény (személynap)


| Név          |   M1  |   M2  |   M3 |   M4  | Összesen |
|--------------|-------|-------|------|-------|----------|
| `Kele Dominik Norbert` | `1` | `2` | `5` | `3.5`   | `11.5`     |
| `Rózsa István` | `1.5`   | `2`   | `5` | `2`   | `10.5`     |
| `Horváth Krisztián`   | `1`   | `1` | `6` | `2` | `10`     |
| `Hörömpö Márk`   | `1`   | `1` | `6` | `2` | `10`     |
| `Kvak Barnabás`   | `1.5`   | `2.5` | `6` | `2.5` | `12.5`     |
| `Horváth Richárd Soma`   | `1`   | `1` | `6.5` | `1.5` | `10`     |s
| `Hajas Attila István`   | `1`   | `1` | `6` | `2` | `10`     |

### 10.2. Részletes feladatszámok

| Név          |   M1  |   M2  |   M3 |   M4 | Összesen |
|--------------|-------|-------|------|------|----------|
| `Kele Dominik Norbert` | `1`   | `1`   | `4`  | `2`  | `8`     |
| `Rózsa István` | `2`   | `1`   | `4`  | `2`  | `9`     |
| `Horváth Krisztián`   | `1`   | `1` | `4` | `2` | `8`     |
| `Hörömpö Márk`   | `1`   | `1`   | `4`  | `2`  | `8`     |
| `Kvak Barnabás`   | `1`   | `1`   | `4`  | `2`  | `8`     |
| `Horváth Richárd Soma`   | `1`   | `1`   | `4`  | `2`  | `8`     |
| `Hajas Attila István`   | `1`   | `1`   | `4`  | `2`  | `8`     |

### 10.3. Részletes költségvetés

| Név                                 | M1      | M2       | M3       | M4       | Összesen  |
|-------------------------------------|---------|----------|----------|----------|-----------|
| Maximálisan megszerezhető pontszám  |  (7)    | (20)     | (35)     |  (28)    | 100% (70) |
| `Kele Dominik Norbert`                        | `6`     | `12`     | `30`     |  `22`    | 70        |
| `Rózsa István`                        | `7`     | `10`     | `33`     |  `20`    | 70        |
| `Horváth Krisztián`                          | `6`     | `9`     | `28`     |  `27`    | 70        |
| `Hörömpö Márk`                          | `6`     | `9`     | `34`     |  `21`    | 70        |
| `Kvak Barnabás`                          | `7`     | `16`     | `20`     |  `27`    | 70        |
| `Horváth Richárd Soma`                          | `6`     | `8`     | `28`     |  `28`    | 70        |
| `Hajas Attila István`                          | `6`     | `17`     | `30`     |  `17`    | 70        |

Szeged, `2023-10-25`.
