
# Editing the target platform


we both need m2e PDE integration and targetplatform-dsl to correctly edit these files


## m2e PDE

Please install `m2e PDE integration` feature in order to correctly edit the target file (in order to open the dependencies coming from maven central)
(this feature is available in the http://download.eclipse.org/releases/2022-06 update site )


## targetplatform-dsl
2/ Please install TP DSL to edit the `gemoc_studio.tpd` file

Source/User guide:
https://github.com/eclipse-cbi/targetplatform-dsl

Update-site:
https://download.eclipse.org/cbi/updates/tpd/nightly/latest

Never edit the `gemoc_studio.target` directly, generate it from the `gemoc_studio.tpd` (right-click on the file -> Create Target Definition File)

Optional: you should be able to use the `update_target.sh` script to achieve the same headless 

 