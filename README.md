# Verifica firma EIDAS models

Fonte template redazione documento:  https://www.makeareadme.com/.


# Descrizione

Il seguente modulo è utilizzato come **dipendenza** dai progetti che prevedono una interazione con il servizio di Verifica firma EIDAS in cui sono implementate le logiche di verifica di firme digitali dei formati più noti (vedi ETSI https://www.etsi.org/) per mezzo delle librerie prodotte dalla Digital Signature Service - DSS (https://ec.europa.eu/digital-building-blocks/wikis/display/DIGITAL/Digital+Signature+Service+-++DSS); vengono quindi definiti i modelli (o wrapper) attraverso i quali, un qualunque client sviluppato in Java, può interagire con tale servizio.

# Installazione

Come già specificato nel paragrafo precedente [Descrizione](# Descrizione) si tratta di un progetto di tipo "libreria", quindi un modulo applicativo utilizzato attraverso la definzione della dipendenza Maven secondo lo standard previsto (https://maven.apache.org/): 

```xml
<dependency>
    <groupId>it.eng.parer</groupId>
    <artifactId>verificafirma-eidas-beans</artifactId>
    <version>$VERSIONE</version>
</dependency>
```

# Utilizzo

L'utilizzo di questa libreria è legato all'invocazione, attraverso client sviluppati in linguaggio Java, del servizio di verifica firma eidas il quale permette di riconoscere e validare, documenti con firme digitali nei formati noti/standard (vedi ETSI https://www.etsi.org/). Il modulo si compone quindi delle classi base che il client potrà utilizzare sia in ambito di chiamata al servizio (oggetto da fornire in input) sia per la gestione della risposta (oggetto ottenuto in output). Per una maggiore comprensione della sintassi e della semantica dei singoli oggetti, è possibile consultare la documentazione delle Api RESTFul attraverso il servizio di verifica firma eidas e lo Swagger (https://swagger.io/) basato su OpenAPI 3.x, auto generato.

### javax.activation versus jakarta

Con il passaggio alla versione 17 di Java e dei framework utilizzati (nel caso specifico Spring Boot alla versione 3.x), si è dovuti passare al nuovo standard utilizzato sotto il package jakarta.* e non più javax.* (vedere release notes https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0.0-M1-Release-Notes).

# Supporto

Progetto a cura di [Engineering Ingegneria Informatica S.p.A.](https://www.eng.it/).

# Contributi

Se interessati a crontribuire alla crescita del progetto potete scrivere all'indirizzo email <a href="mailto:areasviluppoparer@regione.emilia-romagna.it">areasviluppoparer@regione.emilia-romagna.it</a>.

# Autori

Proprietà intellettuale del progetto di [Regione Emilia-Romagna](https://www.regione.emilia-romagna.it/) e [Polo Archivisitico](https://poloarchivistico.regione.emilia-romagna.it/).

# Licenza

Questo progetto è rilasciato sotto licenza GNU Affero General Public License v3.0 or later ([LICENSE.txt](LICENSE.txt)).
