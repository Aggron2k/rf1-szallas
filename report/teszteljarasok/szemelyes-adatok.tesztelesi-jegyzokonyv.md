# Tesztjegyzőkönyv-`Személyes adatok CURD`

Az alábbi tesztdokumentum a `rf-szallas` projekthez tartozó `8.3.17. Személyes adatok (CRUD)` funkcióihoz készült. Felelőse: `Horváth Krisztián Sándor`

## 1. Teszteljárások (TP)

### 1.1. Teljes név módosítás funkció tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02, TC-03
- Leírás: Teljes név módosításának tesztelése
    0. lépés: Nyissuk meg az alkalmazást, jeletnkezünk be az oldalra, majd a `Profil` menüpontra kattintsunk rá
    1. lépés: A `Vezetéknév módosítás` szövegbeviteli mezőbe írjunk be az új vezetéknevünket
    2. lépés: A `Keresztnév módosítás` szövegbeviteli mezőbe írjunk be az új keresztnevünket
    3. lépés: Nyomjuk meg az `Név frissítés` gombot
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `Sikeres módosítás!`

### 1.2. Felhasználónév módosítás funkció tesztelése
- Azonosító: TP-02
- Tesztesetek: TC-04, TC-05
- Leírás: Felhasználónév módosításának tesztelése
  0. lépés: Nyissuk meg az alkalmazást, jeletnkezünk be az oldalra, majd a `Profil` menüpontra kattintsunk rá
  1. lépés: A `Új felhasználónév megadása` szövegbeviteli mezőbe írjunk be az új felhasználónevünket
  2. lépés: Nyomjuk meg az `Felhasználónév frissítés` gombot
  3. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `Sikeres módosítás!`

### 1.3. Jelszó módosítás funkció tesztelése
- Azonosító: TP-03
- Tesztesetek: TC-06, TC-07, TC-08, TC-09
- Leírás: Jelszó módosításának tesztelése
  0. lépés: Nyissuk meg az alkalmazást, jeletnkezünk be az oldalra, majd a `Profil` menüpontra kattintsunk rá
  1. lépés: A `Írd be az új jelszód (min 6 karakter)` szövegbeviteli mezőbe írjunk be az új jelszónkat
  2. lépés: A `Írd be az új jelszód újra (min 6 karakter)` szövegbeviteli mezőbe írjunk be az új jelszónkat újra
  3. lépés: Nyomjuk meg az `Jelszó frissítés` gombot
  4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `Sikeres módosítás!`

### 1.4. E-mail cím módosítás funkció tesztelése
- Azonosító: TP-04
- Tesztesetek: TC-10, TC-11, TC-12 
- Leírás: E-mail cím módosításának tesztelése
  0. lépés: Nyissuk meg az alkalmazást, jeletnkezünk be az oldalra, majd a `Profil` menüpontra kattintsunk rá
  1. lépés: A `Új E-mail cím megadása` szövegbeviteli mezőbe írjunk be az új E-mail címünket
  2. lépés: Nyomjuk meg az `Email frissítés` gombot
  3. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: `Sikeres módosítás!`


## 2. Teszesetek (TC)

### 2.1. Teljes név módosítás funkció tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Teljes név módosításának tesztelése
- Bemenet: `Vezetéknév módosítás` = Nagy ; `Keresztnév módosítás` = Árpád
- Művelet: nyomjuk meg az `Név frissítés` gombot
- Elvárt kimenet: Megjelenő zöld üzenet doboz: `Sikeres módosítás!`, Felhasználói adatok megváltoznak: Név: Nagy Árpád

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: Teljes név módosításának tesztelése
- Bemenet: `Vezetéknév módosítás` = "Üresen hagyjuk" ; `Keresztnév módosítás` = Márton
- Művelet: nyomjuk meg az `Név frissítés` gombot
- Elvárt kimenet: Megjelenző Alert doboz: `Kérjük, töltse ki ezt a mezőt.`, Felhasználói adatok nem változnak

#### 2.1.3. TC-03
- TP: TP-01
- Leírás: Teljes név módosításának tesztelése
- Bemenet: `Vezetéknév módosítás` =  Vass ; `Keresztnév módosítás` = "Üresen hagyjuk"
- Művelet: nyomjuk meg az `Név frissítés` gombot
- Elvárt kimenet: Megjelenző Alert doboz: `Kérjük, töltse ki ezt a mezőt.`, Felhasználói adatok nem változnak

### 2.2. Felhasználónév módosítás funkció tesztesetei

#### 2.2.1. TC-04
- TP: TP-02
- Leírás: Felhasználónév módosításának tesztelése
- Bemenet: `Új felhasználónév megadása` =  jancsika94
- Művelet: nyomjuk meg az `Felhasználónév frissítés` gombot
- Elvárt kimenet: Megjelenő zöld üzenet doboz: `Sikeres módosítás!`, Felhasználói adatok megváltoznak: Felhasználónév: jancsika94

#### 2.2.2. TC-05
- TP: TP-02
- Leírás: Felhasználónév módosításának tesztelése
- Bemenet: `Új felhasználónév megadása` =  "Üresen hagyjuk"
- Művelet: nyomjuk meg az `Felhasználónév frissítés` gombot
- Elvárt kimenet:  Megjelenző Alert doboz: `Kérjük, töltse ki ezt a mezőt.`, Felhasználói adatok nem változnak

### 2.3. Jelszó módosítás funkció tesztesetei
#### 2.2.1. TC-06
#### 2.3.2. TC-07
#### 2.3.3. TC-08
#### 2.3.4. TC-09

### 2.4. E-mail cím módosítás funkció tesztesetei

#### 2.4.1. TC-10
- TP: TP-04
- Leírás: E-mail módosításának tesztelése
- Bemenet: `Új E-mail cím megadása` =  jancsika94@gmail.com
- Művelet: nyomjuk meg az `Email frissítés` gombot
- Elvárt kimenet: Megjelenő zöld üzenet doboz: `Sikeres módosítás!`, Felhasználói adatok megváltoznak: Email: jancsika94@gmail.com

#### 2.4.2. TC-11
- TP: TP-04
- Leírás: E-mail módosításának tesztelése
- Bemenet: `Új E-mail cím megadása` =  "Üresen hagyjuk"
- Művelet: nyomjuk meg az `Email frissítés` gombot
- Elvárt kimenet: Megjelenző Alert doboz: `Kérjük, töltse ki ezt a mezőt.`, Felhasználói adatok nem változnak

#### 2.4.3. TC-12
- TP: TP-04
- Leírás: E-mail módosításának tesztelése
- Bemenet: `Új E-mail cím megadása` =  broszki
- Művelet: nyomjuk meg az `Email frissítés` gombot
- Elvárt kimenet: Megjelenző Alert doboz: `Kérjük, írjon egy @ karaktert az e-mail címbe. A(z) "broszki" címből hiányzik a "@" jel.`, Felhasználói adatok nem változnak


## 3. Tesztriportok (TR)

### 3.1. Teljes név módosítás funkció tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Nagy-ot beírtam
    2. lépés: Árpád-ot beírtam
    3. lépés: a gomb egyszeri megnyomás után frissít az oldal
    4. lépés: helyes eredményt kaptam (Név: Nagy Árpád)

#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: Üresen hagytam
    2. lépés: Márton-t beírtam
    3. lépés: a gomb egyszeri megnyomás után frissít az oldal
    4. lépés: helyes eredményt kaptam (HIBA)

#### 3.1.3. TR-03 (TC-03)
- TP: TP-01
    1. lépés: Vass-t beírtam
    2. lépés: Üresen hagytam
    3. lépés: a gomb egyszeri megnyomás után frissít az oldal
    4. lépés: helyes eredményt kaptam (HIBA)

### 3.2. Felhasználónév módosítás funkció tesztriportjai

#### 3.2.1. TR-01 (TC-04)
- TP: TP-02
  1. lépés: jancsika94-at beírtam
  2. lépés: a gomb egyszeri megnyomás után frissít az oldal
  3. lépés: helyes eredményt kaptam (Felhasználónév: jancsika94)
  
#### 3.2.2. TR-02 (TC-05)
- TP: TP-02
  1. lépés: Üresen hagytam
  2. lépés: a gomb egyszeri megnyomás után frissít az oldal
  3. lépés: helyes eredményt kaptam (HIBA)

### 3.3. Jelszó módosítás funkció tesztriportjai

#### 3.3.1. TR-01 (TC-06)
#### 3.3.2. TR-02 (TC-07)
#### 3.3.3. TR-03 (TC-08)
#### 3.3.4. TR-04 (TC-09)

### 3.4. E-mail cím módosítás funkció tesztriportjai

#### 3.4.1. TR-01 (TC-10)
- TP: TP-04
  1. lépés: jancsika94@gmail.com-at beírtam
  2. lépés: a gomb egyszeri megnyomás után frissít az oldal
  3. lépés: helyes eredményt kaptam (E-mail: jancsika94@gmail.com)
  
#### 3.4.2. TR-02 (TC-11)
- TP: TP-04
  1. lépés: Üresen hagytam
  2. lépés: a gomb egyszeri megnyomás után frissít az oldal
  3. lépés: helyes eredményt kaptam (HIBA)

#### 3.4.3. TR-03 (TC-12)
- TP: TP-04
  1. lépés: broszki-t beírtam
  2. lépés: a gomb egyszeri megnyomás után frissít az oldal
  3. lépés: helyes eredményt kaptam (HIBA)
  

