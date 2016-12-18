/*
 * Copyright (c) 2003-2012, Ronald B. Cemer , Konstantin Pribluda, William Whitney, Andrea De Pasquale
 *
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package net.sourceforge.javaocr.ocrPlugins.OCRDemo;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.CharacterRange;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.OCRScanner;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.TrainingImage;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.TrainingImageLoader;
import net.sourceforge.javaocr.scanner.PixelImage;

/**
 * Demo application to demonstrate OCR document scanning and decoding.
 * @author Ronald B. Cemer
 */
public class OCRScannerDemo
{

    private static final long serialVersionUID = 1L;
    private boolean debug = true;
    private Image image;
    private OCRScanner scanner;

    public OCRScannerDemo()
    {
        scanner = new OCRScanner();
    }

    /**
     * Load demo training images.
     * @param trainingImageDir The directory from which to load the images.
     */
    public void loadTrainingImages(String trainingImageDir)
    {
        if (debug)
        {
            System.err.println("loadTrainingImages(" + trainingImageDir + ")");
        }
        if (!trainingImageDir.endsWith(File.separator))
        {
            trainingImageDir += File.separator;
        }
        try
        {
            scanner.clearTrainingImages();
            TrainingImageLoader loader = new TrainingImageLoader();
            HashMap<Character, ArrayList<TrainingImage>> trainingImageMap = new HashMap<Character, ArrayList<TrainingImage>>();
//            if (debug)
//            {
//                System.err.println("ascii.png");
//            }
//            loader.load(
//                    trainingImageDir + "ascii.png",
//                    new CharacterRange('!', '~'),
//                    trainingImageMap);
//            if (debug)
//            {
//                System.err.println("hpljPica.jpg");
//            }
//            loader.load(
//                    trainingImageDir + "hpljPica.jpg",
//                    new CharacterRange('!', '~'),
//                    trainingImageMap);
//            if (debug)
//            {
//                System.err.println("digits.jpg");
//            }
//            loader.load(
//                    trainingImageDir + "digits.jpg",
//                    new CharacterRange('0', '9'),
//                    trainingImageMap);
//            if (debug)
//        {
//            System.err.println("googleFont.png");
//        }
//            loader.load(
//                    trainingImageDir + "googleFont.png",
//                    new CharacterRange('!', '~'),
//                    trainingImageMap);
//            if (debug)
//            {
//                System.err.println("hebFont.png");
//            }
//            loader.load(
//                    trainingImageDir + "hebFont.png",
//                    new CharacterRange('א', 'ת'),
//                    trainingImageMap);
//            loader.load(
//                    trainingImageDir + "tamrur.png",
//                    new CharacterRange('0', '9'),
//                    trainingImageMap);
            loader.load(
                    trainingImageDir + "0.png",
                    new CharacterRange('0', '0'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "1.png",
                    new CharacterRange('1', '1'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "3.png",
                    new CharacterRange('3', '3'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "9.png",
                    new CharacterRange('9', '9'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "alef.png",
                    new CharacterRange('א', 'א'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "bet.png",
                    new CharacterRange('ב', 'ב'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "gimel.png",
                    new CharacterRange('ג', 'ג'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "dalet.png",
                    new CharacterRange('ד', 'ד'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "hey.png",
                    new CharacterRange('ה', 'ה'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "vav.png",
                    new CharacterRange('ו', 'ו'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "het.png",
                    new CharacterRange('ח', 'ח'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "yud.png",
                    new CharacterRange('י', 'י'),
                    trainingImageMap);
            loader.load(
                trainingImageDir + "kaf.png",
                new CharacterRange('כ', 'כ'),
                trainingImageMap);
            loader.load(
                    trainingImageDir + "lamed.png",
                    new CharacterRange('ל', 'ל'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "mem.png",
                    new CharacterRange('מ', 'מ'),
                    trainingImageMap);
            loader.load(
                trainingImageDir + "memSofit.png",
                new CharacterRange('ם', 'ם'),
                trainingImageMap);
            loader.load(
                    trainingImageDir + "nun.png",
                    new CharacterRange('נ', 'נ'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "ain.png",
                    new CharacterRange('ע', 'ע'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "pey.png",
                    new CharacterRange('פ', 'פ'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "reish.png",
                    new CharacterRange('ר', 'ר'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "shin.png",
                    new CharacterRange('ש', 'ש'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "taf.png",
                    new CharacterRange('ת', 'ת'),
                    trainingImageMap);
            loader.load(
                    trainingImageDir + "geresh.png",
                    new CharacterRange('\'', '\''),
                    trainingImageMap);
//            loader.load(
//                    trainingImageDir + "nekudotaim.png",
//                    new CharacterRange(':', ':'),
//                    trainingImageMap);
            loader.load(
                    trainingImageDir + "makaf.png",
                    new CharacterRange('-', '-'),
                    trainingImageMap);
            if (debug)
            {
                System.err.println("adding images");
            }
            scanner.addTrainingImages(trainingImageMap);
            if (debug)
            {
                System.err.println("loadTrainingImages() done");
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            System.exit(2);
        }
    }

    public void process(String imageFilename)
    {
        if (debug)
        {
            System.err.println("process(" + imageFilename + ")");
        }
        try
        {
            image = ImageIO.read(new File(imageFilename));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        if (image == null)
        {
            System.err.println("Cannot find image file: " + imageFilename);
            return;
        }

        if (debug)
        {
            System.err.println("constructing new PixelImage");
        }

        PixelImage pixelImage = new PixelImage(image);
        if (debug)
        {
            System.err.println("converting PixelImage to grayScale");
        }
        pixelImage.toGrayScale(true);
        if (debug)
        {
            System.err.println("filtering");
        }
        pixelImage.filter();
        if (debug)
        {
            System.err.println("setting image for display");
        }
       
        System.out.println(imageFilename + ":");
        String text = scanner.scan(image, 0, 0, 0, 0, null);
        char[] textInArray = text.toCharArray();
        reverseArray(textInArray);
        for(char c : textInArray){
            System.out.print(c);
        }
        System.out.println();

    }

    private void reverseArray(char[] textInArray) {
        for(int i = 0; i < textInArray.length / 2; i++){
            swap(textInArray, i, textInArray.length - i - 1);
        }
    }

    private void swap(char[] textInArray, int i, int i1) {
        char temp = textInArray[i];
        textInArray[i] = textInArray[i1];
        textInArray[i1] = temp;
    }

    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.err.println("Please specify one or more image filenames.");
            System.exit(1);
        }
        String trainingImageDir = System.getProperty("TRAINING_IMAGE_DIR");
        if (trainingImageDir == null)
        {
            System.err.println("Please specify -DTRAINING_IMAGE_DIR=<dir> on "
                    + "the java command line.");
            return;
        }
        OCRScannerDemo demo = new OCRScannerDemo();
        demo.loadTrainingImages(trainingImageDir);
        for (int i = 0; i < args.length; i++)
        {
            demo.process(args[i]);
        }
        System.out.println("done.");
    }
    private static final Logger LOG = Logger.getLogger(OCRScannerDemo.class.getName());
}
