//
//  ViewController.swift
//  GithubKMP
//
//  Created by Balin on 9/16/19.
//  Copyright © 2019 Balin. All rights reserved.
//

import UIKit
import shared

class ViewController: UIViewController {

    @IBOutlet weak var mGreetingLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        mGreetingLabel.text = Greeting().greeting()
        // Do any additional setup after loading the view.
    }


}

