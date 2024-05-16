file://<WORKSPACE>/Day3/OptionType.scala
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.

action parameters:
uri: file://<WORKSPACE>/Day3/OptionType.scala
text:
```scala
//optionalType
val optionalInt: Option[Int] = Some(42)
//usual type
val normal: Int =45

val actualValue= optionalInt match {
  case Some(value) => 
  case None => "No value"
}
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.core.TypeOps$.dominators$1(TypeOps.scala:248)
	dotty.tools.dotc.core.TypeOps$.approximateOr$1(TypeOps.scala:382)
	dotty.tools.dotc.core.TypeOps$.orDominator(TypeOps.scala:395)
	dotty.tools.dotc.core.Types$OrType.join(Types.scala:3546)
	dotty.tools.dotc.core.Types$OrType.widenUnionWithoutNull(Types.scala:3562)
	dotty.tools.dotc.core.Types$Type.widenUnion(Types.scala:1354)
	dotty.tools.dotc.core.ConstraintHandling.widenOr$1(ConstraintHandling.scala:653)
	dotty.tools.dotc.core.ConstraintHandling.widenInferred(ConstraintHandling.scala:669)
	dotty.tools.dotc.core.ConstraintHandling.widenInferred$(ConstraintHandling.scala:29)
	dotty.tools.dotc.core.TypeComparer.widenInferred(TypeComparer.scala:30)
	dotty.tools.dotc.core.TypeComparer$.widenInferred(TypeComparer.scala:3220)
	dotty.tools.dotc.typer.Namer.rhsType$1(Namer.scala:1952)
	dotty.tools.dotc.typer.Namer.cookedRhsType$1(Namer.scala:1958)
	dotty.tools.dotc.typer.Namer.lhsType$1(Namer.scala:1959)
	dotty.tools.dotc.typer.Namer.inferredResultType(Namer.scala:1970)
	dotty.tools.dotc.typer.Namer.inferredType$1(Namer.scala:1708)
	dotty.tools.dotc.typer.Namer.valOrDefDefSig(Namer.scala:1714)
	dotty.tools.dotc.typer.Namer$Completer.typeSig(Namer.scala:796)
	dotty.tools.dotc.typer.Namer$Completer.completeInCreationContext(Namer.scala:943)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:823)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:189)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:191)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:393)
	dotty.tools.dotc.typer.Typer.retrieveSym(Typer.scala:3061)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3086)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3197)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3275)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3279)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3301)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3347)
	dotty.tools.dotc.typer.Typer.typedClassDef(Typer.scala:2789)
	dotty.tools.dotc.typer.Typer.typedTypeOrClassDef$1(Typer.scala:3102)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3106)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3197)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3275)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3279)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3301)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3347)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:2922)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3148)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3198)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3275)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3279)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3391)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$1(TyperPhase.scala:47)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:477)
	dotty.tools.dotc.typer.TyperPhase.typeCheck(TyperPhase.scala:53)
	dotty.tools.dotc.typer.TyperPhase.$anonfun$4(TyperPhase.scala:99)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:684)
	scala.collection.immutable.List$.from(List.scala:681)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:898)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:100)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:315)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1323)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:337)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:348)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:357)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:71)
	dotty.tools.dotc.Run.compileUnits(Run.scala:357)
	dotty.tools.dotc.Run.compileSources(Run.scala:261)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:165)
	dotty.tools.pc.MetalsDriver.run(MetalsDriver.scala:47)
	dotty.tools.pc.PcCollector.<init>(PcCollector.scala:42)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:106)
```
#### Short summary: 

java.lang.AssertionError: assertion failed