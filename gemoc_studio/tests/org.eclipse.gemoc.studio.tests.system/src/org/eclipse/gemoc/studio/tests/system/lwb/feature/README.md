This package gathers system tests that correspond to user features of the **Language Workbench**.

These tests covers the various ways to interact with the studio for a given 
feature (ie. the various ways to achieve a step of a scenario).


As opposed to user stories, they usually start with some data/projects. 
The method test order is not supposed to be important (be careful to the @Before/@After)


The following table tries to list the features, which test implement it and where is the user documentation.

| Features  												| Test classes  	| User documentation 	|
|---														|---				|--- 					|
| Create Empty Sequential Language  						|   				| 	 					|
| Create Sequential Language from ecore model				|   				| 	 					|
| Create Sequential Language from ecore model and k3		|   				| 	 					|
| Generate language runtime for official sample languages	|  GenerateLangRuntime4OfficialSampleLegacyFSM_Test.xtend 				| 	 					|
| Generate traceability for official sample languages		|  GenerateTrace4OfficialSampleLegacyFSM_Test.xtend  				| 	 					|
| xDSML Perspective shortcuts  								|  XDSMLPerspective_Test.xtend 				| 	 					|
| Create domain model for language 							|   				| 	 					|
| Create behavior for sequential language (k3)				|   				| 	 					|
| Create behavior for sequential language (ale)				|   				| 	 					|
| Create concrete syntax for language (sirius)				|   				| 	 					|
| Create concrete syntax for language (xtext)				|   				| 	 					|
| Create concrete syntax for language (emf.editor)			|   				| 	 					|
| Create animation diagram for language (sirius)			|   				| 	 					|