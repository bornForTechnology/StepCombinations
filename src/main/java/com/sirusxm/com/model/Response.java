package com.sirusxm.com.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Response
{
    private int numberOfSteps;
    private List<int[]> stepCombinations;

    public int getNumberOfSteps()
    {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps)
    {
        this.numberOfSteps = numberOfSteps;
    }

    public List<int[]> getStepCombinations()
    {
        return stepCombinations;
    }

    public void setStepCombinations(List<int[]> stepCombinations)
    {
        this.stepCombinations = stepCombinations;
    }
}
