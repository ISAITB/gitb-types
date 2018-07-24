# Introduction

The **gitb-types** library is a supporting resource for the GITB test bed software and specifications. It encapsulates the
WSDLs of the service APIs foreseen by the GITB specifications as well as the XSD type definitions. This library 
contains the set of prebuilt Java classes corresponding to these WSDLs and XSDs to be used as-is in the development
of the GITB test bed software and GITB-compliant services.

The GITB specifications are the result of the
[CEN Global eBusiness Interoperability Test bed (GITB) Workshop Agreement](http://www.cen.eu/work/areas/ict/ebusiness/pages/ws-gitb.aspx).
Evolutive maintenance of the GITB specifications and software is now performed by the European Commission's DIGIT [ISA Unit](http://ec.europa.eu/isa/isa2)
and specifically [ISA Action 2016.25](https://ec.europa.eu/isa2/actions/platform-test-it-systems-services-and-products_en).
For more information please check the [Interoperability Test Bed's site](https://joinup.ec.europa.eu/solution/interoperability-test-bed/about)
on Joinup. 

# Build instructions

This library is developed in Java and is built using Maven 3+. To build issue the following:

```
mvn clean install
```  

To also sign the resulting artefacts use the `sign-artifacts` profile as follows (you can optionally specify the 
key to use for signing through the system property `gpg.keyname`).

```
mvn clean install -P sign-artifacts
``` 