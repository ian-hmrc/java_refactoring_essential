#!/bin/bash

# Define variables
MAINCLASS="com.codemanship.refactoring.legacycode.ShippingApp"
JAR=""

# Find the first .jar file in the target directory (recursively)
# find target -name "*.jar" -type f -print -quit looks for files and stops at the first match
JAR=$(find target -name "*.jar" -type f | head -n 1)

# Check if JAR was found
if [ -z "$JAR" ]; then
    echo "No JAR found in target/. Run mvn package first."
    exit 1
fi

echo "Using JAR: $JAR"
echo ""

# Loop through the order IDs
for ORDER in 1001 1002 1003
do
    echo "================================"
    echo "Running order $ORDER"
    echo "================================"
    java -cp "$JAR" "$MAINCLASS" "$ORDER"
    echo ""
done

# Equivalent to 'pause' in Windows
read -p "Press [Enter] key to continue..."