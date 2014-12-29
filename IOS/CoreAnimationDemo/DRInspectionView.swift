    //
//  DRInspectionView.swift
//  CoreAnimationDemo
//
//  Created by XinLi on 12/8/14.
//  Copyright (c) 2014 XinLi. All rights reserved.
//

import UIKit

class DRInspectionView: UIView {

    /*
    // Only override drawRect: if you perform custom drawing.
    // An empty implementation adversely affects performance during animation.
    override func drawRect(rect: CGRect) {
        // Drawing code
    }
    */
    
     override class func layerClass() -> AnyClass {
        
        return DRInspectionLayer.classForCoder()
    }
    
    

}
