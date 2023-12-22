package com.abhinay.switch$programs;

/*
 * Switch statement in Java is used to select one of the many code blocks to be
 * executed. The value of the expression in switch statement is compared with
 * the values of each case.
 * 
 * If there is a match, the associated block of code is executed. Switch case in
 * Java is fall-through which means it executes all the cases after the first
 * match if a break statement is not encountered.
 * 
 * The switch case is called a fall-through statement when we miss out break
 * statements in switch cases. In such scenarios, when a case passes, all the
 * subsequent cases execute as well until a break statement or the end of the
 * switch block is encountered.
 * 
 * Important rules for Switch case in Java Let’s quickly go through some
 * standard rules for writing switch cases.
 * 
 * Important Points about Java's switch statement:
 * 
 * No variables: 
 * The case value in switch statement must be a literal or
 * constant. Also, it must be of the same type as switch expression. 
 * 
 * No duplicates:
 * No two cases in a switch statement should be of same value.
 * Otherwise, compilation error is thrown. 
 * 
 * Allowed Types: 
 * The Java switch expression must be of int, long, byte, short, enums and String type.
 * Primitives are allowed with their wrapper types. 
 * 
 * Optional Break Statement:
 * Break statement is optional in Java's switch statement. If a case is matched
 * and there is no break statement mentioned, subsequent cases are executed
 * until a break statement or end of the switch statement is encountered.
 * 
 * Optional default case: 
 * default case value is optional. The default statement
 * is meant to execute when there is no match between the values of the variable
 * and the cases. It can be placed anywhere in the switch block according to the
 * required result.
 */
