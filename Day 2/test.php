<?php
ini_set( 'display_errors', 1 );
error_reporting( E_ALL );
$from = "shubhambarman0007@gmail.com";
$to = "shubhambarman1117@gmail.com";
$subject = "Checking PHP mail";
$message = "PHP mail works just fine";
$headers = "From:" . $from;
if(mail($to,$subject,$message, $headers)) {
    echo "The email message was sent.";
} else {
    echo "The email message was not sent.";
}
?>