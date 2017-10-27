# ISO 20022 on Corda
This project demonstrates how to load and process the publicly available ISO 20022 e-Repository and use it to generate Corda-ready code.

The main work is done in `com.swift.standards.lab.generators.ISO20022CordAppGenerator`. Launch and configure this with the `_mains.ISO20022CordAppGenerator_Main` class.

_Before any of this will work though, you must first deal with a few dependencies because I'm not a Gradle expert, so haven't fully automated any of the dependency management yet_ **Expert Help Appreciated here**

## Dependencies include:
- **Eclipse Modeling Framework:** I haven't yet isolated the simplest subset, so the easiest way to get started is to download and install the [latest Eclipse Modeling Tools package](https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/keplersr2) - Some clues in the pom.xml
- **Eclipse Maven Plugin:** [StackOverflow is your friend](https://stackoverflow.com/questions/8620127/maven-in-eclipse-step-by-step-installation)
- **ISO 20022 e-Repository:** Follow the instructions in [eRepository/Readme.md].
- **Corda:** The current needs explicit access to corda-0.14.0.jar and corda-core-0.14.0.jar that I have locally (referenced via an Eclipse User Library) _Would greatly appreciate expert help to efficiently upgrade this to the latest using Gradle or something._

_TODO: More documentation necessary..._