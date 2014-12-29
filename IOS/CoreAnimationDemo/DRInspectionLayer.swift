//
//  DRInspectionLayer.swift
//  CoreAnimationDemo
//
//  Created by XinLi on 12/8/14.
//  Copyright (c) 2014 XinLi. All rights reserved.
//

import UIKit

class DRInspectionLayer: CALayer {
    
    override init()
    {
        super.init()
    }

    required init(coder aDecoder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    
    override func addAnimation(anim: CAAnimation!, forKey key: String!) {
        
        println("adding animation \(anim.debugDescription)")
        
        super.addAnimation(anim, forKey: key)
        
    }
   
}
