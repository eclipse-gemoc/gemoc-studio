all: html
	#(cd fig && make) &&

init:
	# (cd MarkedGraph; make generes)

# html: Tutorial_Automata-generated.html GuideTutorialMarkedGraph-generated.html
html: GuideTutorialMarkedGraph-generated.html
sigpml: Tutorial_SigPML.html

GuideTutorialMarkedGraph-generated.asciidoc: GuideTutorialMarkedGraph.asciidoc init
	cat $<	\
	    | sed -e '/^ifeval/d'	\
	    | sed -e '/^endif/d'	\
	    > $@

Tutorial_Automata-generated.asciidoc: Tutorial_Automata.asciidoc
	cat $<	\
	    | sed -e '/^ifeval/d'	\
	    | sed -e '/^endif/d'	\
	    > $@

Tutorial_Automata-generated.html: images/tutorial images/icons asciidoc.conf tools/plantuml.jar


%.html: %.asciidoc
	# (cd images/tutorial && make)
	asciidoctor -a data-uri -a icons --attribute tabsize=4 $<
	# -a max-width=55em

clean:
	(cd images/tutorial && make clean)
	rm Tutorial_Automata.html

include ${HOME}/usr/make/pandoc.make

