*** How to create a blank maven project ***

The easiest way I've found to do this is to use the pom-root archetype to create the top-level pom and then repeatedly use archetype:generate to create each module individually. This will automatically add the modules to the root pom (aggregator) and set the root pom as the parent pom for each module (edit: apparently some archetypes can have a hard-coded parent, but it works for maven-archetype-quickstart).

Here's the breakdown:

1. Create the top-level root: mvn archetype:generate \
-DarchetypeGroupId=org.codehaus.mojo.archetypes \
-DarchetypeArtifactId=pom-root \
-DarchetypeVersion=RELEASE

2. cd into your newly created root dir.

3. For each module: mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=RELEASE

