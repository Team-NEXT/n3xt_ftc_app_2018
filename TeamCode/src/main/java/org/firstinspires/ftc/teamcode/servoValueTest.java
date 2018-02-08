package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by anshnanda on 04/02/18.
 */

@TeleOp (name = "Servo motor value test", group = "test")

public class servoValueTest extends LinearOpMode{

    //GamePad 2
    //Grabber
//    private DcMotor grabMotor;
    private Servo grabTopLeft;
    private Servo grabTopRight;
    private Servo grabBottomLeft;
    private Servo grabBottomRight;

    //Relic
//    private DcMotor relicMotor;
//    private Servo relicServo1;
//    private Servo relicServo2;
//
//    //Ball
//    private Servo knockerServo;
//    private Servo armServo;

    @Override
    public void runOpMode() throws InterruptedException{

        //Grabber
//        grabMotor = hardwareMap.get(DcMotor.class, "grabMotor");
        grabTopLeft = hardwareMap.get(Servo.class, "GTL");
        grabTopRight = hardwareMap.get(Servo.class, "GTR");
        grabBottomLeft = hardwareMap.get(Servo.class, "GBL");
        grabBottomRight = hardwareMap.get(Servo.class, "GBR");

//        //Relic
//        relicMotor = hardwareMap.get(DcMotor.class,"relic");
//        relicServo1 = hardwareMap.get(Servo.class, "relicServo1");
//        relicServo2 = hardwareMap.get(Servo.class, "relicServo2");
//
//        //Ball
//        knockerServo = hardwareMap.get(Servo.class, "knockerServo");
//        armServo = hardwareMap.get(Servo.class, "armServo");

        char currServo = ' ';
        double leftpos = 0;
        double rightpos = 0;
        double uleftpos = 0;
        double urightpos = 0;

        waitForStart();

        while (opModeIsActive()){

//            if(gamepad1.a)
//            {
//                currServo = 'a';
//            }
//            if(gamepad1.b)
//            {
//                currServo = 'b';
//            }
//            if(gamepad1.x)
//            {
//                currServo = 'x';
//            }
//            if(gamepad1.y)
//            {
//                currServo = 'y';
//            }
//
//            switch(currServo)
//            {
//                case 'a':
//                    grabTopLeft.setPosition(gamepad1.right_trigger);
//                    telemetry.addData("Servo in use : ", "grab top left");
//                    break;
//                case 'b':
//                    grabTopRight.setPosition(gamepad1.right_trigger);
//                    telemetry.addData("Servo in use : ", "grab top right");
//                    break;
//                case 'x':
//                    grabBottomLeft.setPosition(gamepad1.right_trigger);
//                    telemetry.addData("Servo in use : ", "Grab bottom left");
//                    break;
//                case 'y':
//                    grabBottomRight.setPosition(gamepad1.right_trigger);
//                    telemetry.addData("Servo in use : ", "Grab bottom right");
//                    break;
//
//                default:
//
//                    telemetry.addData("Servo in use : ", "none");
//            }

            grabTopLeft.setPosition(uleftpos);
            grabTopRight.setPosition(urightpos);

            if(gamepad1.right_bumper){
                uleftpos = uleftpos + 0.05;
            }
            if(gamepad1.left_bumper){
                uleftpos = uleftpos - 0.05;
            }
            if(gamepad1.right_stick_button){
                urightpos = urightpos + 0.05;
            }
            if(gamepad1.left_stick_button){
                urightpos = urightpos - 0.05;
            }

            grabBottomLeft.setPosition(leftpos);
            grabBottomRight.setPosition(rightpos);

            if(gamepad1.dpad_right){
                leftpos = leftpos + 0.05;
            }
            if(gamepad1.dpad_left){
                leftpos = leftpos - 0.05;
            }
            if(gamepad1.dpad_up){
                rightpos = rightpos + 0.05;
            }
            if(gamepad1.dpad_down){
                rightpos = rightpos - 0.05;
            }




            //grabBottomLeft.setPosition(0.6);
//            grabTopRight.setPosition(0);
//            grabTopLeft.setPosition(0);

            telemetry.addData("Grab bottom right ", grabBottomRight.getPosition());
            telemetry.addData("Grab top right ", grabTopRight.getPosition());
            telemetry.addData("grab bottom left ", grabBottomLeft.getPosition());
            telemetry.addData("grab top left", grabTopLeft.getPosition());
            telemetry.addData("Position : " , gamepad1.right_trigger);
            telemetry.update();
            idle();

        }

    }

}

//grab servo values should be between 0.4 and 0.6
//for the right side it should be 0.4 for tight grip while for the left 0.6 for the same
