# Changelog

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
