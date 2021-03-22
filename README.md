# intellij-code-coverage

Shows the bug in IntellJ code coverage

 * run AppTest code coverage with tracing enabled
 * tested using Adopt 11.0.9 & Adopt 8.0.252
 * line 8 is shown as 'partial coverage' even though both paths are taken
 * running with JaCoCo coverage shows everything green
 * removing the try/catch block fixes the problem