javac -d out $(find src -name *.java) && java -cp out/ app/LabelPrinter $@