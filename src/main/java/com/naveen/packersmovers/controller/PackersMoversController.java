package com.naveen.packersmovers.controller;

import com.naveen.packersmovers.messageservice.MessageService;
import com.naveen.packersmovers.model.Customer;
import com.naveen.packersmovers.service.PackersMoversService;

//import com.naveen.userinfo.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/home")
@CrossOrigin

public class PackersMoversController {
        @Autowired
        private PackersMoversService userService;
                
        @Autowired
        private MessageService messageService;
        
        @PostMapping("/customerDetails")
        public String customerDetails(@RequestBody Customer customer){
            userService.saveUser(customer);
            //messageService.sendMessage(customer);
            return "New user is added";
        }
        
        
        @GetMapping("/ping")
        public String ping() {

        	return "Specifications\r\n"
        			+ "General\r\n"
        			+ "In The Box\r\n"
        			+ "Handset, Adapter (5V/2A), USB Cable, SIM Card Tool, Important Info Booklet with Warranty Card, Quick Guide\r\n"
        			+ "Model Number\r\n"
        			+ "RMX3231\r\n"
        			+ "Model Name\r\n"
        			+ "C11 2021\r\n"
        			+ "Color\r\n"
        			+ "Cool Grey\r\n"
        			+ "Browse Type\r\n"
        			+ "Smartphones\r\n"
        			+ "SIM Type\r\n"
        			+ "Dual Sim\r\n"
        			+ "Hybrid Sim Slot\r\n"
        			+ "No\r\n"
        			+ "Touchscreen\r\n"
        			+ "Yes\r\n"
        			+ "OTG Compatible\r\n"
        			+ "Yes\r\n"
        			+ "Sound Enhancements\r\n"
        			+ "Dirac Sound Effect\r\n"
        			+ "Display Features\r\n"
        			+ "Display Size\r\n"
        			+ "16.51 cm (6.5 inch)\r\n"
        			+ "Resolution\r\n"
        			+ "1600 x 720 Pixels\r\n"
        			+ "Resolution Type\r\n"
        			+ "HD+\r\n"
        			+ "GPU\r\n"
        			+ "IMG 8322\r\n"
        			+ "Display Type\r\n"
        			+ "HD+ LCD In-cell\r\n"
        			+ "Display Colors\r\n"
        			+ "16.7M\r\n"
        			+ "Other Display Features\r\n"
        			+ "60 Hz Refresh Rate, 20:09 Aspect Ratio, 89.50% Screen-to-Body Ratio, 120 Hz Touch Sampling Rate, Brightness: 360 nits (Min), 400nits (Typ), Color Saturation: NTSC 70% (Typ), Sunlight Screen Support, COG Sealing Process\r\n"
        			+ "Os & Processor Features\r\n"
        			+ "Operating System\r\n"
        			+ "Android 11\r\n"
        			+ "Processor Type\r\n"
        			+ "Octa-core\r\n"
        			+ "Processor Core\r\n"
        			+ "Octa Core\r\n"
        			+ "Primary Clock Speed\r\n"
        			+ "1.6 GHz\r\n"
        			+ "Secondary Clock Speed\r\n"
        			+ "1.2 GHz\r\n"
        			+ "Operating Frequency\r\n"
        			+ "2G GSM: 850/900/1800/1900 MHz, 3G WCDMA: 850/900/2100 MHz, 4G FDD-LTE: B1/B3/B5/B8, 4G TD-LTE: B38/B40/B41 (2535 - 2655 MHz)\r\n"
        			+ "Memory & Storage Features\r\n"
        			+ "Internal Storage\r\n"
        			+ "32 GB\r\n"
        			+ "RAM\r\n"
        			+ "2 GB\r\n"
        			+ "Expandable Storage\r\n"
        			+ "256 GB\r\n"
        			+ "Memory Card Slot Type\r\n"
        			+ "Dedicated Slot\r\n"
        			+ "Camera Features\r\n"
        			+ "Primary Camera Available\r\n"
        			+ "Yes\r\n"
        			+ "Primary Camera\r\n"
        			+ "8MP Rear Camera\r\n"
        			+ "Primary Camera Features\r\n"
        			+ "8MP Rear Camera, (f/2.0 Aperture, 4P Lens Number, 1/4 inch Sensor Size, Pixel Size: 1.12μm, AF), Support 30 Continuous Shooting, CMOS Sensor, Photograph Function: Panoramic View, Portrait Mode, Expert, Timelapse, HDR, Beauty, Filter\r\n"
        			+ "Secondary Camera Available\r\n"
        			+ "Yes\r\n"
        			+ "Secondary Camera\r\n"
        			+ "5MP Front Camera\r\n"
        			+ "Secondary Camera Features\r\n"
        			+ "5MP Front Camera, (f/2.2 Aperture, Sensor Size: 1/5 Inch, Pixel Size: 1.12 μm, 3P Lens, FF) CMOS Sensor, Photography Functions: Portrait Mode, Beauty Mode, HDR, Face-Recognition, Filter\r\n"
        			+ "Flash\r\n"
        			+ "Rear - LED Flash\r\n"
        			+ "HD Recording\r\n"
        			+ "Yes\r\n"
        			+ "Video Recording\r\n"
        			+ "Yes\r\n"
        			+ "Video Recording Resolution\r\n"
        			+ "Rear Camera: 480p (at 30fps), 720p (at 30fps), 1080p (at 30fps), Front Camera: default 720p (at 30fps), Support 480p (at 30fps), CIF (at 30fps)\r\n"
        			+ "Digital Zoom\r\n"
        			+ "4X\r\n"
        			+ "Frame Rate\r\n"
        			+ "30 fps\r\n"
        			+ "Connectivity Features\r\n"
        			+ "Network Type\r\n"
        			+ "4G VOLTE, 4G, 3G, 2G\r\n"
        			+ "Supported Networks\r\n"
        			+ "4G VoLTE, 4G LTE, WCDMA, GSM\r\n"
        			+ "Internet Connectivity\r\n"
        			+ "4G, 3G, Wi-Fi, EDGE, GPRS\r\n"
        			+ "3G\r\n"
        			+ "Yes\r\n"
        			+ "GPRS\r\n"
        			+ "Yes\r\n"
        			+ "Pre-installed Browser\r\n"
        			+ "Google Chrome\r\n"
        			+ "Bluetooth Support\r\n"
        			+ "Yes\r\n"
        			+ "Bluetooth Version\r\n"
        			+ "v4.2\r\n"
        			+ "Wi-Fi Version\r\n"
        			+ "IEEE 802.11 b/g/n (WiFi 4)\r\n"
        			+ "Wi-Fi Hotspot\r\n"
        			+ "Yes\r\n"
        			+ "USB Connectivity\r\n"
        			+ "Yes\r\n"
        			+ "EDGE\r\n"
        			+ "Yes\r\n"
        			+ "Audio Jack\r\n"
        			+ "3.5mm\r\n"
        			+ "Map Support\r\n"
        			+ "Google Maps\r\n"
        			+ "GPS Support\r\n"
        			+ "Yes\r\n"
        			+ "Other Details\r\n"
        			+ "Smartphone\r\n"
        			+ "Yes\r\n"
        			+ "Touchscreen Type\r\n"
        			+ "Capacitive\r\n"
        			+ "SIM Size\r\n"
        			+ "Nano + Nano\r\n"
        			+ "SMS\r\n"
        			+ "Yes\r\n"
        			+ "Voice Input\r\n"
        			+ "Yes\r\n"
        			+ "Graphics PPI\r\n"
        			+ "269 PPI\r\n"
        			+ "Sensors\r\n"
        			+ "Magnetic Induction Sensor, Light Sensor, Proximity Sensor, Gyro-meter\r\n"
        			+ "Browser\r\n"
        			+ "Google Chrome\r\n"
        			+ "Ringtones Format\r\n"
        			+ "MP4\r\n"
        			+ "Other Features\r\n"
        			+ "eMMC5.1 ROM, Dual Channel RAM, Max Charging Power: 10W, BC1.2 Charging Protocol, 5V 1.3A Reverse Charging, LTE 2x2 MIMO, Phone Lock Functions: Face Unlock, Password Unlock, Pattern Unlock, Google Smart Lock, 2D Face Unlock Technology, Private Protection, OTG Storage Format: FAT32, EXFAT, NTFS, L3 WideVine Supported, Night Shiled, APP Market\r\n"
        			+ "GPS Type\r\n"
        			+ "GPS/AGPS, Beidou, Glonass, Galileo\r\n"
        			+ "Multimedia Features\r\n"
        			+ "Audio Formats\r\n"
        			+ "AAC, HE-AAC v1, HE-AAC v2, AMR, AWB, MIDI, MP3, OGG VORBIS\r\n"
        			+ "Video Formats\r\n"
        			+ "MP4, 3GP, 3G2, 3GPP, 3GPP2, M4V, MKV\r\n"
        			+ "Battery & Power Features\r\n"
        			+ "Battery Capacity\r\n"
        			+ "5000 mAh\r\n"
        			+ "Dimensions\r\n"
        			+ "Width\r\n"
        			+ "76.4 mm\r\n"
        			+ "Height\r\n"
        			+ "165.2 mm\r\n"
        			+ "Depth\r\n"
        			+ "8.9 mm\r\n"
        			+ "Weight\r\n"
        			+ "190 g\r\n"
        			+ "Warranty\r\n"
        			+ "Warranty Summary\r\n"
        			+ "1 Year Warranty for Mobile and 6 Months for Accessories\r\n"
        			+ "Domestic Warranty\r\n"
        			+ "1 Year";
        }



    }

