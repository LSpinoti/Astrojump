#!/bin/sh

BASEDIR=$(cd "$(dirname "${BASH_SOURCE[0]}")" &> /dev/null && pwd)
if [[ $BASEDIR == $(pwd) ]]
then
	java Astrojump
else
	echo "Run this in the base directory"
fi
