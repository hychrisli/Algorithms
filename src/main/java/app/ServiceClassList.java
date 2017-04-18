package app;

import java.util.ArrayList;

import base.SolutionService;
import services.MedianTwoSortedArraysServiceImpl;
import services.TwoSumServiceImpl;

public class ServiceClassList extends ArrayList<Class<? extends SolutionService>> {
    private static final long serialVersionUID = 8073262282403642560L;
    
    public ServiceClassList(){
        this.add(TwoSumServiceImpl.class);
        this.add(MedianTwoSortedArraysServiceImpl.class);
    }

}