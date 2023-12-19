package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

    @Test
    public void bracketsMultipleReversed() {
        String message = "a set of brackets reversed multiple times returns false";
        String testData = "]]]]]]]]]][[[[[[[[[[";
        boolean result = (BalancedBrackets.hasBalancedBrackets(testData));
        assertFalse(result, message);
    }

    @Test
    public void bracketsBeforeCharacters() {
        String message = "balanced brackets in front of characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsEncapsulatesCharacters() {
        String message = "balanced brackets encapsulates other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketWithinCharacters() {
        String message = "balanced brackets a bracket is mixed within the other characters returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void tripleThreatBackToBackBrackets() {
        String message = "balanced brackets three sets of empty brackets consecutive returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void tripleNestedBrackets() {
        String message = "triple nested Russian doll brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleOpeningBracket() {
        String message = "a single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void singleClosingBracket() {
        String message = "a single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void reversedBrackets() {
        String message = "a set of reverse brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void singleBracketMixedInCharacters() {
        String message = "a single opening bracket with characters returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void bothBracketsMixedInCharacters() {
        String message = "unbalanced brackets mixed with characters returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void crazyBrackets() {
        String message = "crazy brackets returns false";
        String testData = "[][[[]]][[][]]]][[[][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void plotTwistNoBrackets() {
        String message = "characters, no brackets returns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void emptyString() {
        String message = "an empty returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleSpace() {
        String message = "a single space returns true";
        String testData = " ";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void alternateBackwardsBrackets() {
        String message = "alternate backward brackets returns false";
        String testData = "][][][][][][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void incompleteBracket() {
        String message = "an incomplete double bracket returns false";
        String testData = "[][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void balancedBracketsAroundANumber() {
        String message = "balanced brackets around a number returns true";
        String testData = "[5]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void balancedAroundCharacter() {
        String message = "balanced brackets around a character returns true";
        String testData = "[?]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void unbalancedAroundCharacter() {
        String message = "unbalanced brackets around characters returns false";
        String testData = "]]&";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void unbalancedAroundNumber() {
        String message = "unbalanced brackets around numbers returns false";
        String testData = "6[57]5[67]5]7]][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
}