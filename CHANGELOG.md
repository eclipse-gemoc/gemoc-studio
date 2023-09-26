# Changelog

## v3.6.0 (06/04/2023)

#### Enhancements:

- [**enhancement**] Manage step params in MW test cases [#280](https://github.com/eclipse/gemoc-studio/pull/280)
- [**enhancement**][**refactoring**] Split commons eclipse pde to remove UI dependency [#276](https://github.com/eclipse/gemoc-studio/pull/276)

#### Bug Fixes:

- [**bug**] Bump to version of k3 including StepCommand return null fix [#284](https://github.com/eclipse/gemoc-studio/pull/284)

#### Refactorings

- [**refactoring**] Move commons from modeldebugging repository to dedicated repository [#275](https://github.com/eclipse/gemoc-studio/pull/275)

#### Version upgrades

- [**bump**] Bump K3 version to 2022-12-20 [#281](https://github.com/eclipse/gemoc-studio/pull/281)
- [**bump**] Bump to melange 2022-09-29 [#278](https://github.com/eclipse/gemoc-studio/pull/278)
- [**bump**] Bump xtend and k3 [#282](https://github.com/eclipse/gemoc-studio/pull/282)
- [**bump**] Bump to Eclipse 2022-06 [#273](https://github.com/eclipse/gemoc-studio/pull/273)

#### Release Engineering

- [**releng**] Use fixed version of k3 to ensure reproducibility [#279](https://github.com/eclipse/gemoc-studio/pull/279)

---

## v3.5.0 (30/06/2022)

#### Enhancements:

- [**enhancement**] K3FSM sample improvements [#256](https://github.com/eclipse/gemoc-studio/pull/256)
- [**enhancement**] Add new k3fsm modeling samples [#257](https://github.com/eclipse/gemoc-studio/pull/257)
- [**enhancement**] Initial version of a Webprotocol based EngineAddon server [#264](https://github.com/eclipse/gemoc-studio/pull/264)

#### Bug Fixes:

- [**bug**] Make K3FSM semantics work with null input/outputs [#258](https://github.com/eclipse/gemoc-studio/pull/258)

#### Version upgrades

- [**bump**] Bump to 3.5.0 [#254](https://github.com/eclipse/gemoc-studio/pull/254)
- [**bump**] Bump eclipse 2021 12 [#255](https://github.com/eclipse/gemoc-studio/pull/255)

#### Release Engineering

- [**releng**] Update target to latest and target generation script [#263](https://github.com/eclipse/gemoc-studio/pull/263)
- [**releng**] MacOS M1 processor version of the Studio [#268](https://github.com/eclipse/gemoc-studio/pull/268)
- [**releng**] Add nodejs to docker for CI [#265](https://github.com/eclipse/gemoc-studio/pull/265)
- [**releng**] Update docker ci eclipse jenkins image [#261](https://github.com/eclipse/gemoc-studio/pull/261)
- [**releng**] Use tpd for defining target platform [#259](https://github.com/eclipse/gemoc-studio/pull/259)

---

## v3.4.0 (10/01/2022)

#### Enhancements:

- [**enhancement**] Example behavioral interface and implementation relationship [#251](https://github.com/eclipse/gemoc-studio/pull/251)

#### Bug Fixes:

- [**bug**] Re-enable workspace location prompt on startup [#238](https://github.com/eclipse/gemoc-studio/pull/238)

#### Version upgrades

- [**releng**][**bump**] Bump Studio to 3.4.0 [#236](https://github.com/eclipse/gemoc-studio/pull/236)

#### Release Engineering

- [**releng**] Fix mvn deploy config [#242](https://github.com/eclipse/gemoc-studio/pull/242)
- [**releng**] Bundle vs pomfirst separate build and groupid [#240](https://github.com/eclipse/gemoc-studio/pull/240)
- [**releng**] Fixes usage of GEMOC updatesite with recent Eclipse package [#250](https://github.com/eclipse/gemoc-studio/pull/250)

---

## v3.3.0 (28/07/2021)

#### Enhancements:

- [**enhancement**] Disable flacky tests [#227](https://github.com/eclipse/gemoc-studio/pull/227)
- [**enhancement**][**testing**] Improve test suites timings [#229](https://github.com/eclipse/gemoc-studio/pull/229)
- [**bug**][**enhancement**][**releng**] Add Sirius ELK support [#222](https://github.com/eclipse/gemoc-studio/pull/222)
- [**enhancement**] Remove use of ALESiriusInterpreter in headles launcher [#216](https://github.com/eclipse/gemoc-studio/pull/216)

#### Refactorings

- [**documentation**][**refactoring**] Improvement of the official examples documentation [#217](https://github.com/eclipse/gemoc-studio/pull/217)

#### Version upgrades

- [**bump**] Bump to Eclipse 2021-06 [#231](https://github.com/eclipse/gemoc-studio/pull/231)
- [**bump**] Bump eclipse 2020-12 [#219](https://github.com/eclipse/gemoc-studio/pull/219)
- [**bump**] Bump to Eclipse 2020-03 [#212](https://github.com/eclipse/gemoc-studio/pull/212)

#### Release Engineering

- [**releng**] Consolidation and automatic bump of K3 versions [#224](https://github.com/eclipse/gemoc-studio/pull/224)
- [**releng**] Explicit repository feature [#226](https://github.com/eclipse/gemoc-studio/pull/226)
- [**releng**] Use image-tools-plugin 0.1.0 from GEMOC organization [#230](https://github.com/eclipse/gemoc-studio/pull/230)
- [**releng**] Improve docker for CI [#232](https://github.com/eclipse/gemoc-studio/pull/232)
- [**releng**] Provide github issue templates [#215](https://github.com/eclipse/gemoc-studio/pull/215)

---

## v3.2.0 (16/06/2020)

#### Enhancements:

- [**enhancement**] "metaprog" entry added to dsl files for the GEMOC Studio examples [#206](https://github.com/eclipse/gemoc-studio/pull/206)
- [**enhancement**] Add wait for treeitem after expand in tests [#197](https://github.com/eclipse/gemoc-studio/pull/197)
- [**enhancement**][**refactoring**] Improve default Engine addon launch conf tab [#193](https://github.com/eclipse/gemoc-studio/pull/193)
- [**enhancement**] Add automatic creation of missing source folders [#179](https://github.com/eclipse/gemoc-studio/pull/179)
- [**enhancement**] Remove event manager from feature.xml [#177](https://github.com/eclipse/gemoc-studio/pull/177)

#### Bug Fixes:

- [**bug**] Example's metaprog entry fixed [#209](https://github.com/eclipse/gemoc-studio/pull/209)
- [**bug**] Fix xdsmlFilePath attribute in plugin.xml [#196](https://github.com/eclipse/gemoc-studio/pull/196)
- [**bug**] Fix method getEntry of DslImpl [#186](https://github.com/eclipse/gemoc-studio/pull/186)
- [**bug**] autosrc: set java compliance to 1.8 [#182](https://github.com/eclipse/gemoc-studio/pull/182)
- [**bug**][**bump**] Stop ALE engine on error [#176](https://github.com/eclipse/gemoc-studio/pull/176)
- [**bug**] Do not wait for discovery update site availability check in tests [#173](https://github.com/eclipse/gemoc-studio/pull/173)

#### Refactorings

- [**refactoring**] Move commons to gemoc-studio-modeldebugging git repository [#200](https://github.com/eclipse/gemoc-studio/pull/200)
- [**refactoring**] Move JavaEngine to its own dedicated git repository [#199](https://github.com/eclipse/gemoc-studio/pull/199)
- [**refactoring**] Uses new generic Context and RunConfiguration classes from execution framework [#198](https://github.com/eclipse/gemoc-studio/pull/198)
- [**refactoring**] Use general extension point + nature and builder refactoring [#185](https://github.com/eclipse/gemoc-studio/pull/185)

#### Version upgrades

- [**bump**][**releng**] Change Timesquare updatesite [#195](https://github.com/eclipse/gemoc-studio/pull/195)
- [**bump**] Bump to Sirius 6.1.3 [#194](https://github.com/eclipse/gemoc-studio/pull/194)
- [**bump**] Bump ALE to latest version [#184](https://github.com/eclipse/gemoc-studio/pull/184)
- [**bump**] Bump GEMOC Studio to 3.2.0 [#174](https://github.com/eclipse/gemoc-studio/pull/174)

#### Release Engineering

- [**releng**] Fix machine-id of the jenkins docker image [#205](https://github.com/eclipse/gemoc-studio/pull/205)
- [**releng**] Deploy GEMOC artefacts to maven repository (repo.eclipse.org) [#204](https://github.com/eclipse/gemoc-studio/pull/204)
- [**releng**] Add OCLInEcore to the GEMOC Studio [#188](https://github.com/eclipse/gemoc-studio/pull/188)
- [**releng**] Improve test video recording [#190](https://github.com/eclipse/gemoc-studio/pull/190)
- [**releng**] Tycho 1.5 and p2 dependencies optimisation [#189](https://github.com/eclipse/gemoc-studio/pull/189)
- [**releng**] Use custom docker image for building the studio on the CI [#187](https://github.com/eclipse/gemoc-studio/pull/187)
- [**releng**] Improved docker image for local build [#181](https://github.com/eclipse/gemoc-studio/pull/181)
- [**releng**] Remove deprecated update site [#180](https://github.com/eclipse/gemoc-studio/pull/180)
- [**releng**] Merge products and updatesite projects [#175](https://github.com/eclipse/gemoc-studio/pull/175)

---

## v3.2.0-20191216 (16/12/2019)

#### Enhancements:

- [**enhancement**] Add automatic creation of missing source folders [#179](https://github.com/eclipse/gemoc-studio/pull/179)
- [**enhancement**] Remove event manager from feature.xml [#177](https://github.com/eclipse/gemoc-studio/pull/177)

#### Bug Fixes:

- [**bug**] Fix method getEntry of DslImpl [#186](https://github.com/eclipse/gemoc-studio/pull/186)
- [**bug**] autosrc: set java compliance to 1.8 [#182](https://github.com/eclipse/gemoc-studio/pull/182)
- [**bug**][**bump**] Stop ALE engine on error [#176](https://github.com/eclipse/gemoc-studio/pull/176)
- [**bug**] Do not wait for discovery update site availability check in tests [#173](https://github.com/eclipse/gemoc-studio/pull/173)

#### Refactorings

- [**refactoring**] Use general extension point + nature and builder refactoring [#185](https://github.com/eclipse/gemoc-studio/pull/185)

#### Version upgrades

- [**bump**][**releng**] Change Timesquare updatesite [#195](https://github.com/eclipse/gemoc-studio/pull/195)
- [**bump**] Bump to Sirius 6.1.3 [#194](https://github.com/eclipse/gemoc-studio/pull/194)
- [**bump**] Bump ALE to latest version [#184](https://github.com/eclipse/gemoc-studio/pull/184)
- [**bump**] Bump GEMOC Studio to 3.2.0 [#174](https://github.com/eclipse/gemoc-studio/pull/174)

#### Release Engineering

- [**releng**] Add OCLInEcore to the GEMOC Studio [#188](https://github.com/eclipse/gemoc-studio/pull/188)
- [**releng**] Improve test video recording [#190](https://github.com/eclipse/gemoc-studio/pull/190)
- [**releng**] Tycho 1.5 and p2 dependencies optimisation [#189](https://github.com/eclipse/gemoc-studio/pull/189)
- [**releng**] Use custom docker image for building the studio on the CI [#187](https://github.com/eclipse/gemoc-studio/pull/187)
- [**releng**] Improved docker image for local build [#181](https://github.com/eclipse/gemoc-studio/pull/181)
- [**releng**] Remove deprecated update site [#180](https://github.com/eclipse/gemoc-studio/pull/180)
- [**releng**] Merge products and updatesite projects [#175](https://github.com/eclipse/gemoc-studio/pull/175)

---

## v3.1.0 (29/07/2019)

#### Enhancements:

- [**enhancement**] Improve messaging system startup [#157](https://github.com/eclipse/gemoc-studio/pull/157)
- [**enhancement**] Increase swtbot test timeout [#158](https://github.com/eclipse/gemoc-studio/pull/158)
- [**enhancement**] Improve Sirius wizard for Gemoc [#156](https://github.com/eclipse/gemoc-studio/pull/156)
- [**enhancement**] Add concurrent engine to studio [#148](https://github.com/eclipse/gemoc-studio/pull/148)
- [**enhancement**] Improve Variable and Debug views [#143](https://github.com/eclipse/gemoc-studio/pull/143)
- [**enhancement**] Add command line Eclipse application to run GEMOC languages and headless product [#138](https://github.com/eclipse/gemoc-studio/pull/138)
- [**enhancement**] Integrate ALE interpreted engine in GEMOC Studio build [#126](https://github.com/eclipse/gemoc-studio/pull/126)
- [**enhancement**][**refactoring**] Move dsl default location to project root [#124](https://github.com/eclipse/gemoc-studio/pull/124)
- [**enhancement**] Add pre-release version of ecoretools epackage registration [#118](https://github.com/eclipse/gemoc-studio/pull/118)
- [**enhancement**] Add new K3FSM official example [#81](https://github.com/eclipse/gemoc-studio/pull/81)
- [**enhancement**] Improve documentation [#74](https://github.com/eclipse/gemoc-studio/pull/74)
- [**enhancement**] Add syntax highlighting to DSL files [#78](https://github.com/eclipse/gemoc-studio/pull/78)
- [**enhancement**] Add dockerfile and instructions for building documentation via docker [#76](https://github.com/eclipse/gemoc-studio/pull/76)
- [**enhancement**][**refactoring**][**releng**] Improve web documentation [#72](https://github.com/eclipse/gemoc-studio/pull/72)

#### Bug Fixes:

- [**bug**] Add a base test for modeldebugging bug #66 [#106](https://github.com/eclipse/gemoc-studio/pull/106)
- [**bug**] Fix error level in activator logger [#141](https://github.com/eclipse/gemoc-studio/pull/141)
- [**bug**] Fixes K3FSM example [#89](https://github.com/eclipse/gemoc-studio/pull/89)
- [**bug**] Change start option for java9 and gtk3 support [#69](https://github.com/eclipse/gemoc-studio/pull/69)

#### Refactorings

- [**documentation**][**refactoring**] Rename LegacyFSM example to MelangeK3FSM [#136](https://github.com/eclipse/gemoc-studio/pull/136)

#### Version upgrades

- [**bump**] Bump ALE version to 2019-06-24 [#166](https://github.com/eclipse/gemoc-studio/pull/166)
- [**bump**] Bump to Eclipse Photon [#117](https://github.com/eclipse/gemoc-studio/pull/117)
- [**bump**] Bump to latest k3/melange version [#102](https://github.com/eclipse/gemoc-studio/pull/102)
- [**bump**] Bump components and studio versions [#101](https://github.com/eclipse/gemoc-studio/pull/101)
- [**bump**] Update Melange to version 2018-06-04 [#80](https://github.com/eclipse/gemoc-studio/pull/80)

#### Release Engineering

- [**releng**] Added GEMOC model icon using official colors to artwork folder [#149](https://github.com/eclipse/gemoc-studio/pull/149)
- [**releng**] Add gexpressions to studio/updatesite and restructure update site [#165](https://github.com/eclipse/gemoc-studio/pull/165)
- [**releng**] Use url for discovery that is unique for gemoc 3.1.x [#162](https://github.com/eclipse/gemoc-studio/pull/162)
- [**releng**] Update icons to official branding colors [#160](https://github.com/eclipse/gemoc-studio/pull/160)
- [**releng**] Remove the jenkinsfile from the component repositories [#154](https://github.com/eclipse/gemoc-studio/pull/154)
- [**documentation**][**releng**] Re-enable plantuml figures in documentation [#153](https://github.com/eclipse/gemoc-studio/pull/153)
- [**releng**] Remove 32 bit versions of the studio [#145](https://github.com/eclipse/gemoc-studio/pull/145)
- [**releng**] Fix docker file for pomless builds [#134](https://github.com/eclipse/gemoc-studio/pull/134)
- [**releng**] Correct css for nightly build download index page [#129](https://github.com/eclipse/gemoc-studio/pull/129)
- [**releng**] Fix xtend compilation issue 1373 [#132](https://github.com/eclipse/gemoc-studio/pull/132)
- [**releng**] New system test suite based on official example K3FSM (language and modeling) [#104](https://github.com/eclipse/gemoc-studio/pull/104)
- [**releng**] Show summary of checked out branches in multibranch pipeline [#92](https://github.com/eclipse/gemoc-studio/pull/92)

---

## v3.1.0-20190627 (27/06/2019)

#### Enhancements:

- [**enhancement**] Improve messaging system startup [#157](https://github.com/eclipse/gemoc-studio/pull/157)
- [**enhancement**] Increase swtbot test timeout [#158](https://github.com/eclipse/gemoc-studio/pull/158)
- [**enhancement**] Improve Sirius wizard for Gemoc [#156](https://github.com/eclipse/gemoc-studio/pull/156)
- [**enhancement**] Add concurrent engine to studio [#148](https://github.com/eclipse/gemoc-studio/pull/148)
- [**enhancement**] Improve Variable and Debug views [#143](https://github.com/eclipse/gemoc-studio/pull/143)
- [**enhancement**] Add command line Eclipse application to run GEMOC languages and headless product [#138](https://github.com/eclipse/gemoc-studio/pull/138)
- [**enhancement**] Integrate ALE interpreted engine in GEMOC Studio build [#126](https://github.com/eclipse/gemoc-studio/pull/126)
- [**enhancement**][**refactoring**] Move dsl default location to project root [#124](https://github.com/eclipse/gemoc-studio/pull/124)
- [**enhancement**] Add pre-release version of ecoretools epackage registration [#118](https://github.com/eclipse/gemoc-studio/pull/118)

#### Bug Fixes:

- [**bug**] Add a base test for modeldebugging bug #66 [#106](https://github.com/eclipse/gemoc-studio/pull/106)
- [**bug**] Fix error level in activator logger [#141](https://github.com/eclipse/gemoc-studio/pull/141)

#### Refactorings

- [**documentation**][**refactoring**] Rename LegacyFSM example to MelangeK3FSM [#136](https://github.com/eclipse/gemoc-studio/pull/136)

#### Version upgrades

- [**bump**] Bump ALE version to 2019-06-24 [#166](https://github.com/eclipse/gemoc-studio/pull/166)
- [**bump**] Bump to Eclipse Photon [#117](https://github.com/eclipse/gemoc-studio/pull/117)
- [**bump**] Bump to latest k3/melange version [#102](https://github.com/eclipse/gemoc-studio/pull/102)
- [**bump**] Bump components and studio versions [#101](https://github.com/eclipse/gemoc-studio/pull/101)

#### Release Engineering

- [**releng**] Added GEMOC model icon using official colors to artwork folder [#149](https://github.com/eclipse/gemoc-studio/pull/149)
- [**releng**] Add gexpressions to studio/updatesite and restructure update site [#165](https://github.com/eclipse/gemoc-studio/pull/165)
- [**releng**] Use url for discovery that is unique for gemoc 3.1.x [#162](https://github.com/eclipse/gemoc-studio/pull/162)
- [**releng**] Update icons to official branding colors [#160](https://github.com/eclipse/gemoc-studio/pull/160)
- [**releng**] Remove the jenkinsfile from the component repositories [#154](https://github.com/eclipse/gemoc-studio/pull/154)
- [**documentation**][**releng**] Re-enable plantuml figures in documentation [#153](https://github.com/eclipse/gemoc-studio/pull/153)
- [**releng**] Remove 32 bit versions of the studio [#145](https://github.com/eclipse/gemoc-studio/pull/145)
- [**releng**] Fix docker file for pomless builds [#134](https://github.com/eclipse/gemoc-studio/pull/134)
- [**releng**] Correct css for nightly build download index page [#129](https://github.com/eclipse/gemoc-studio/pull/129)
- [**releng**] Fix xtend compilation issue 1373 [#132](https://github.com/eclipse/gemoc-studio/pull/132)
- [**releng**] New system test suite based on official example K3FSM (language and modeling) [#104](https://github.com/eclipse/gemoc-studio/pull/104)

---

## v3.0.0 (17/07/2018)
Includes all changes from 3.0.0 release candidates.

---

## v3.0.0-rc4 (22/06/2018)

#### Bug Fixes:

- [**bug**] Fixes K3FSM example [#89](https://github.com/eclipse/gemoc-studio/pull/89)
- [**bug**] Change start option for java9 and gtk3 support [#69](https://github.com/eclipse/gemoc-studio/pull/69)

#### Release Engineering

- [**releng**] Show summary of checked out branches in multibranch pipeline [#92](https://github.com/eclipse/gemoc-studio/pull/92)

---

## v3.0.0-rc3 (07/06/2018)

#### Enhancements:

- [**enhancement**] Add new K3FSM official example [#81](https://github.com/eclipse/gemoc-studio/pull/81)
- [**enhancement**] Add syntax highlighting to DSL files [#78](https://github.com/eclipse/gemoc-studio/pull/78)
- [**enhancement**] Add dockerfile and instructions for building documentation via docker [#76](https://github.com/eclipse/gemoc-studio/pull/76)
- [**enhancement**] Improve documentation [#74](https://github.com/eclipse/gemoc-studio/pull/74)
- [**enhancement**][**refactoring**][**releng**] Improve web documentation [#72](https://github.com/eclipse/gemoc-studio/pull/72)
- [**enhancement**][**releng**] Remove old scm connectors SVN and CVS from studio [#71](https://github.com/eclipse/gemoc-studio/pull/71)
- [**enhancement**] Replace Melange by DSL files in the role of entry point for the studio [#70](https://github.com/eclipse/gemoc-studio/pull/70)
- [**enhancement**] Improve dslfile grammar [#63](https://github.com/eclipse/gemoc-studio/pull/63)

#### Bug Fixes:

- [**bug**] [tests] Workaround to discard webkitgtk error message [#61](https://github.com/eclipse/gemoc-studio/pull/61)

#### Version upgrades

- [**bump**] Upgrade Melange to version 2018-04-11 [#65](https://github.com/eclipse/gemoc-studio/pull/65)

#### Release Engineering

- [**releng**] Use Gren for release note management [#66](https://github.com/eclipse/gemoc-studio/pull/66)

---

## v3.0.0-rc2 (11/04/2018)

#### Enhancements:

- [**enhancement**][**refactoring**] Change grammar of DSL file  to a grammar similar to Java property file [#40](https://github.com/eclipse/gemoc-studio/pull/40)

#### Bug Fixes:

- [**bug**] Improve Discovery error reporting in case of incorrect configuration [#53](https://github.com/eclipse/gemoc-studio/pull/53)
- [**bug**] ensures to run changeStyle in an UI thread when printing large messages on console [#44](https://github.com/eclipse/gemoc-studio/pull/44)

#### Version upgrades

- [**bump**] Upgrade to Melange 2018-01-19 [#48](https://github.com/eclipse/gemoc-studio/pull/48)
- [**bump**][**releng**] Update tycho to version 1.0.0 [#34](https://github.com/eclipse/gemoc-studio/pull/34)

#### Release Engineering

- [**releng**] Releng improvements [#50](https://github.com/eclipse/gemoc-studio/pull/50)

---

## v3.0.0-rc1 (07/12/2017)

#### Enhancements:

- [**enhancement**] Improve messagingsystem usability [#38](https://github.com/eclipse/gemoc-studio/pull/38)
- [**enhancement**] Improve xdsml test suites [#35](https://github.com/eclipse/gemoc-studio/pull/35)
- [**enhancement**] Add grammar and editor for DSL file [#13](https://github.com/eclipse/gemoc-studio/pull/13)
- [**enhancement**] Improve option management of GEMOC project wizard templates [#9](https://github.com/eclipse/gemoc-studio/pull/9)

#### Bug Fixes:

- [**bug**] Fix predefined update sites [#29](https://github.com/eclipse/gemoc-studio/pull/29)
- [**bug**] Remove last references to Eclipse Neon [#28](https://github.com/eclipse/gemoc-studio/pull/28)
- [**bug**] Make more robust retry loop in MessagingSystemManager [#5](https://github.com/eclipse/gemoc-studio/pull/5)

#### Refactorings

- [**refactoring**] Change keyword 'semantic' to semantics' in dslfile [#39](https://github.com/eclipse/gemoc-studio/pull/39)
- [**refactoring**] Mass rename org.gemoc -> org.eclipse.gemoc [#16](https://github.com/eclipse/gemoc-studio/pull/16)

#### Version upgrades

- [**bump**] Upgrade to latest k3 version [#33](https://github.com/eclipse/gemoc-studio/pull/33)
- [**bump**] Upgrade to Eclipse Oxygen [#27](https://github.com/eclipse/gemoc-studio/pull/27)
- [**bump**] Migrate to Eclipse oxygen [#23](https://github.com/eclipse/gemoc-studio/pull/23)
- [**bump**] Upgrade version of the studio to 2.4.0 [#7](https://github.com/eclipse/gemoc-studio/pull/7)

#### Release Engineering

- [**releng**] Remove backlog tests from CI build [#36](https://github.com/eclipse/gemoc-studio/pull/36)

---

## v2.4.0 (20/10/2017)

#### Release Engineering

- [**releng**] Add Studio variant identification in splashscreen and about box [#6](https://github.com/eclipse/gemoc-studio/pull/6)
- [**releng**] Add local full build support [#2](https://github.com/eclipse/gemoc-studio/pull/2)
