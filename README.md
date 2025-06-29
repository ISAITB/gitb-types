![Banner](https://www.itb.ec.europa.eu/files/banners/itb_banner.png)

# GITB types library (gitb-types)

[![licence](https://img.shields.io/github/license/ISAITB/gitb-types.svg?color=blue)](https://github.com/ISAITB/csv-validator/blob/master/LICENCE.txt)
[![docs](https://img.shields.io/static/v1?label=docs&message=GITB%20TDL%20&color=blue)](https://www.itb.ec.europa.eu/docs/tdl/latest/)
[![docs](https://img.shields.io/static/v1?label=docs&message=GITB%20test%20services&color=blue)](https://www.itb.ec.europa.eu/docs/services/latest/)
[![Gurubase](https://img.shields.io/badge/Gurubase-Ask%20ITB%20Guru-006BFF?color=blue)](https://gurubase.io/g/itb)
[![Maven Central](https://img.shields.io/maven-central/v/eu.europa.ec.itb/gitb-types.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22eu.europa.ec.itb%22%20AND%20a:%22gitb-types%22)

The **gitb-types** library is a supporting resource for the GITB test bed software and specifications. It encapsulates the
WSDLs of the service APIs foreseen by the GITB specifications as well as the XSD type definitions. This library 
contains the set of prebuilt Java classes corresponding to these WSDLs and XSDs to be used as-is in the development
of the GITB test bed software and GITB-compliant services.

The project is designed to build four artefact types as follows:
* `gitb-types-parent` (POM): The parent POM for all modules containing common settings. 
* `gitb-types` (JAR): The library including Java types, using javax API annotations (JAXB, JAX-WS) for the GITB type definitions and service APIs.
* `gitb-types-jakarta` (JAR): The library including Java types, using Jakarta API annotations (JAXB, JAX-WS) for the GITB type definitions and service APIs.
* `gitb-types-specs` (JAR): The library including only the XSDs and WSDLs defining the GITB specifications.

> Most users would use either `gitb-types` or `gitb-types-jakarta` as dependencies. If you are using a Jakarta EE project
> select `gitb-types-jakarta`, otherwise for a pre-Jakarta EE project use `gitb-types`. Using the wrong type of library
> depending on your setup would result in a JAXB API and implementation mismatch, as well as undetected service operations. 
 
The GITB specifications are the result of the
[CEN Global eBusiness Interoperability Test bed (GITB) Workshop Agreement](http://www.cen.eu/work/areas/ict/ebusiness/pages/ws-gitb.aspx).
Evolutive maintenance of the GITB specifications and software is now performed by the European Commission's DIGIT and specifically 
the [Interoperability Test Bed Action](https://joinup.ec.europa.eu/collection/interoperability-test-bed-repository/solution/interoperability-test-bed)
of the [Interoperable EU initiative](https://joinup.ec.europa.eu/collection/interoperable-europe/interoperable-europe).

# Build instructions

This library is developed in Java and is built using Maven 3+. To build issue the following:

```
mvn clean install
```  

To easily update all modules' version number issue:

```
mvn versions:set -DnewVersion=X.Y.Z -DprocessAllModules -DgenerateBackupPoms=false
```

To perform a release and deploy to the Central Repository the profile `release` needs to be specified:

```
mvn clean deploy -P release
``` 

This profile triggers in addition the following:
* Generation of the module artefacts.
* Generation of Javadocs.
* PGP signatures of all artefacts. To do this you need a GPG local installation. In addition, if multiple keys are
  defined you can specify the appropriate one using the `gpg.keyname` system property. Furthermore, the passphrase 
  entry mode is set to use system property `gpg.passphrase`. These properties can be provided either on the command 
  line or in Maven's `settings.xml` by means of a profile.
* Deployment to the Central repository's staging environment and automatic promotion of the release.

# Licence

This software is shared using the [European Union Public Licence (EUPL) version 1.2](https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12).

Third-party library licences and attributions are listed in [NOTICE.md](NOTICE.md).

# Legal notice

The authors of this library waive any and all liability linked to its usage either directly or as a dependency in other software.

# Contact

For feedback or questions regarding this library you are invited to post issues in the current repository. In addition,
feel free to contact the Test Bed team via email at [DIGIT-ITB@ec.europa.eu](mailto:DIGIT-ITB@ec.europa.eu).

# See also

The `gitb-types` libraries encapsulate the key artefacts and classes foreseen by the GITB specifications. For more information
on these you may refer to:
* The [GITB Test Description Language (TDL)](https://www.itb.ec.europa.eu/docs/tdl/latest/), for authoring conformance test cases.
* The [GITB test services](https://www.itb.ec.europa.eu/docs/services/latest/), for extension services (e.g. validators).

The `gitb-types` libraries are key dependencies used by the Test Bed software and its reusable validators. For more information on these you may refer to:
* The [GITB Test Bed software](https://github.com/ISAITB/gitb), providing a full platform for scenario-based conformance testing.
* The Test Bed's validators for [XML](https://github.com/ISAITB/xml-validator), [RDF](https://github.com/ISAITB/shacl-validator),
  [JSON](https://github.com/ISAITB/json-validator) and [CSV](https://github.com/ISAITB/csv-validator), used as standalone services or as conformance testing building blocks.

For general information on all aspects of the Interoperability Test Bed you may refer to its [Joinup space](https://joinup.ec.europa.eu/collection/interoperability-test-bed-repository/solution/interoperability-test-bed).
