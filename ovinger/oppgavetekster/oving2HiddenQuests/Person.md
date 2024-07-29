# Innkapsling - Person

Oppgaven handler om en `Person`-klasse, som håndterer informasjon om en person (navn, e-post, fødselsdato og kjønn) og implementerer innkapslingsmetoder med validering.

Et `Person`-objekt inneholder _navn_ (både fornavn og etternavn), _e-post_, _fødselsdag_ og _kjønn_:

- Navnet inneholder både fornavn og etternavn (og ingen mellomnavn), som begge må være på minst to bokstaver langt, navnene må være skilt med ett mellomrom og kun inneholde bokstaver.
- E-post-adressen (hvis den ikke er `null`) må være på formen `fornavn.etternavn@domene.landskode`, f.eks. `ola.nordmann@tiller.no` (en liste over landskoder finner du [her](landkoder.txt)).
- Fødselsdagen skal være et dato-objekt (java.util.Date) og kan ikke være frem i tid.
- En persons kjønn skal kunne returneres som `'M'`, `'F'` eller `'X'`.

`Person`-klassen har tilgangsmetoder for å hente og sette tilstandene. Dersom et argument er ugyldig i seg selv, så skal unntaket `IllegalArgumentException` utløses.

- `setName(String)` - oppdaterer navnet (fornavn og etternavn med mellomrom mellom), dersom det er gyldig i henhold til kravene over. Det er greit om navnet som settes, ikke stemmer med e-post-adressen.
- `setEmail(String)` - oppdaterer e-post-adressen, etter å ha sjekket at den stemmer med navnet.
- `setBirthday(Date)` - oppdaterer fødselsdatoen
- `setGender(char)` - oppdaterer kjønnet

I tillegg til disse såkalte _setter_-metodene, så må `Person`-klassen ha tilsvarende _getter_-metoder.

## Nyttig informasjon

- [Innkapsling](https://www.w3schools.com/java/java_encapsulation.asp)
- [String-klassen](https://www.w3schools.com/java/java_strings.asp)
- **Gyldig tilstand**: Tilstanden til et objekt er verdien av alle attributtene. En viktig del av oppførselen til et objekt er å sikre at tilstanden til objektet alltid er gyldig, dvs. at alle attributtene har gyldige/konsistente verdier. Dette kan vi for eksempel gjøre ved å opprette en ekstra metode som sikrer at dataen er godkjent. Feks:

  ```Java
  String name;

  void isValidName(String name) {
      // sjekker gyldigheten til navnet, returnerer true hvis gyldig, false hvis ikke
      // feks at strengen bare inneholder bokstaver
  }

  void setName(String name) {
      if (! isValidName(name)) {
          throw new IllegalArgumentException(... a suitable message ...);
      }
      this.name = name;
  }
  ```

## Java-kode

Implementer `Person`-klassen med stram innkapsling. Eventuelle hjelpemetoder for validering bør også ha stram innkapsling. Det kan være lurt å lese om `String-klassen` og dens metoder før du setter i gang. [Her](https://www.w3schools.com/java/java_strings.asp) og [her](https://www.w3schools.com/java/java_ref_string.asp).

Testkode for denne oppgaven finner du i [oving2/PersonTest.java](../../src/test/java/oving2HiddenQuests/PersonTest.java).

## Ekstraoppgave - Personnummer

Utvid klassen med en persons personnummer. Personnummeret kan ikke settes før kjønn og fødselsdag er satt.

Et personnummer består grovt sett av fødselsdatoen, et (vilkårlig) løpenummer og to kontrollsifre. Kontrollsifrene gjør det enklere å sjekke om et personnummer er ekte. Mer spesifikt er reglene for personnummer som følger:

- Et personnummer består av 11 siffer, med følgende struktur: **D1D2**M1M2**Y1Y2**N1N2N3**K1K2** (fet skrift for lesbarhet).
- De seks første sifrene, **D1D2**M1M2**Y1Y2**, tilsvarer fødselsdatoens dag (1-31), måned (1-12) og år (0-99).
- De tre neste sifrene, N1N2N3, kan antas å være vilkårlige, men N3 må være partall for kvinner og oddetall for menn.
- De to siste sifrene, K1K2, er kontrollsifre, som hver for seg beregnes ut fra de foregående sifrene. Formelen for dem begge er `11 – (VS % 11)`, hvor VS (veid sum) for `K1` er `D1*F1 + D2*F2 + … + N2*F8 + N3*F9` og `VS` for `K2` er `D1*G1 + D2*G2 + … + N3*G9 + K1*G10`. F’ene og G’ene er oppgitt i tabellen under. Dersom formelen gir tallet 11 så skal verdien 0 brukes isteden. Om både K1 og K2 stemmer med kontrollsifferne generert basert på formlene over, så er kontrollsifferne i personnummeret gyldig.

|     | 1   | 2   | 3   | 4   | 5   | 6   | 7   | 8   | 9   | 10  |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| F   | 3   | 7   | 6   | 1   | 8   | 9   | 4   | 5   | 2   |
| G   | 5   | 4   | 3   | 2   | 7   | 6   | 5   | 4   | 3   | 2   |

Implementer kode for å sette med metoden `setSSN(String)`, og validere et gyldig personnummer.

Testkode for denne oppgaven finner du i [oving2/PersonTest2.java](../../src/test/java/oving2HiddenQuests/PersonTest2.java).
