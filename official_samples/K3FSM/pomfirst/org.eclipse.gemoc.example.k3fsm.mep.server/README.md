# k3fsm_mep

K3FSM language with Model Execution Protocol (dev of MEP concept on a smaller example: StateMachine but still with xtext and java engine)


Note: due to tycho limitation, pom-first and manifest-first (plugins) cannot be built in the same maven reactor (cf. https://wiki.eclipse.org/Tycho/How_Tos/Dependency_on_pom-first_artifacts)


It uses lsp4j.debug 0.8.0 and xtext/xtend 2.19.0  (correspond to DAP 1.35.0)

Warning: make sure to use consistent versions (ex: version of xtend used by lsp4j)


Some notes about the K3FSM MEP server

Run the server:

``` 
mvn compile quarkus:dev
``` 

it should open a socket on port 8090

ex: http://localhost:8090/mep/k3fsm


using a websocket client (for ex written in python, notebook or directly in a browser extension)

example requests with SimpleWebSocket client for mozilla https://github.com/WangFenjin/Simple-WebSocket-Client
(replace the `/home/rhiobet/gemoc-glose/k3fsm_mep/pomfirst/org.eclipse.gemoc.example.k3fsm.mep.server` with the actual location on your disk)

``` 
{"type":"request", "command":"initialize"}
{"type":"request","command":"initialize","arguments":{"clientName":"MEPIntegrationTest.testInitialize()"}}
{"type":"request","command":"launch","arguments":{"myKey":"myValue"}}

{"type":"request",
 "command":"launch",
 "arguments":{
	"modelURI":"file:/home/rhiobet/gemoc-glose/k3fsm_mep/pomfirst/org.eclipse.gemoc.example.k3fsm.mep.server/src/test/resources/tests/xtext/models/TwoStatesUpcast.k3fsm", 
	"modelEntryPoint":"/",
	"initializationMethod":"org.eclipse.gemoc.example.k3fsm.k3dsa.FSMAspect.initializeModel",
	"initializationArguments":"abababa",
	"methodEntryPoint":"public static void org.eclipse.gemoc.example.k3fsm.k3dsa.FSMAspect.main(org.eclipse.gemoc.example.k3fsm.FSM)"
	}
}

{"type":"request",
 "command":"next",
 "arguments":{}
}

{"type":"request",
 "command":"stepIn",
 "arguments":{}
}

{"type":"request",
 "command":"stepOut",
 "arguments":{}
}

{"type":"request",
 "command":"terminate",
 "arguments":{}
}

{"type":"request",
 "command":"restart",
 "arguments":{}
}

{"type":"request",
 "command":"variables",
 "arguments":{}
}

{"type":"request",
 "command":"setBreakpoints",
 "arguments": {
    "breakpoints": [
      { "line": 13 },
      { "line": 4 }
    ]
  }
}

{"type":"request",
 "command":"continue",
 "arguments":{}
}
``` 


