Warmok Tool Kit
===============

A multi-player turn-based strategy game kit based on the Eclipse Modelling Framework (EMF)

The Warmok Tool Kit (WTK) is a game hosting service inspired by turn-based strategy games developed and played by the Meekmok Collective. It is named for the Warmok, a specific rule set that we played with the utmost enthusiasm.

The WTK is designed around a modelling framework called EMF. ECore models are used to represent the domain of each game, including the world and whatever classes of entities may inhabit that world. Individual game instances are also expressed and stored in ECore models. The reason for this is reuse and flexibility. Each game model can be slightly different, while sharing some meta-models that are common to turn-based strategy. Rules can be expressed in object constraint language or in code. Ecore and related libraries provide a lot of room for extending new games without writing a lot of new code.

The first game to be mocked will be the WarMok itself. It will consist of a set of models and resources, to be served up via a RESTful interface. The state of play advances according to the rules whenever all players have committed their moves for the current turn.

References
==========

* Object Constraint Language (OCL) http://www.omg.org/spec/OCL/ISO/19507/PDF/
