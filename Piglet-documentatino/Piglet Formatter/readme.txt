PigletFormatter can be used to format an AST for output in textual format. Remember to use the -printer option when you run JTB on the jj file, which will generate a few visitors necessary for formatting. Once that's done, a given AST can be output to standard output as follows:

   ast.accept(new PigletFormatter());
   ast.accept(new TreeDumper());
