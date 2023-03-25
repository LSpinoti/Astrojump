#!/bin/sh

BASEDIR=$(dirname "$0")
javac $BASEDIR/Platform.java -classpath $BASEDIR
javac $BASEDIR/Astrojump.java -classpath $BASEDIR
