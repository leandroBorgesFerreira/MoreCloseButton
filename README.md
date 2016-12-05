[ ![Download](https://api.bintray.com/packages/lehen01/maven/MoreCloseButton/images/download.svg) ](https://bintray.com/lehen01/maven/MoreCloseButton/_latestVersion)


##CloseMoreButton

Custom button with morph animation.

![enter image description here](https://lh3.googleusercontent.com/-3uhI_gNEsww/WENKtvr9U8I/AAAAAAAAK2c/fZRhgkAhzvAfDduWBf2lErObK9JgwWpVQCLcB/s400/moreclose2.gif "moreclose2.gif")


##Usage

   

    <br.com.simplepass.buttonlib.MoreCloseButton
            android:id="@+id/btn_more_close"
            android:layout_width="150dp"
            android:layout_height="150dp"
            android:background="@drawable/button_shape"
            android:layout_centerInParent="true"/>

       btnMoreClose = (MoreCloseButton) findViewById(R.id.btn_more_close);
        btnMoreClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                morthToCloseButton();
            }
        });
        
    private void morthToCloseButton(){
            if(pressed) {
                pressed = false;
                btnMoreClose.morthToMoreButton();
            } else{
                pressed = true;
                btnMoreClose.morthToCloseButton();
            }
        }

## Installation

    compile 'br.com.simplepass:moreclosebutton:[lastestVersion]'

## Bugs and Feedback


For bugs, feature requests, and discussion please use [GitHub Issues](https://github.com/leandroBorgesFerreira/MoreCLoseButton/issues).

## Credits


This lib was based on this [article](https://engineering.canva.com/2016/05/16/five-visual-effects/) by CHRIS DOBLE


## License
The MIT License (MIT)

Copyright (c) 2015 Leandro Ferreira

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

> Written with [StackEdit](https://stackedit.io/).

